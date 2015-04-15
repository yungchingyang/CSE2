//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//April 10 2015
//CSE2 Linear Java Program
//It is a program that finds student's grade in CSE2.
//
//  first compile the program
//      javac CSE2Linear.java
//  run the program
//      java CSE2Linear//
//    
//

    import java.util.Scanner;   //import Scanner
    import java.util.Random;    //import random number generator

    public class CSE2Linear {  //define a class
        
        //Main method
        public static void main (String [ ] Args) { //define main method
            
            Scanner scan = new Scanner(System.in);  //construct scanner
            int [ ] myList = new int[15];   //declare array
            int i=2;    //declare variable
            int b=0;    //declare variable
            int c=0;    //declare variable
            int val1=0; //declare variable
            
            
            for ( i=2; i>=2; i++ ) {    //start the loop to produce array
                
                System.out.print("Enter 15 ints for final grades in CSE2: \n"); //prompt the user to enter 15 integers
                        
                    for ( b=0; b<myList.length; b++) {  //fill the array with numbers
                        
                        if ( scan.hasNextInt() ) {  //check if the inputs are integers
                            
                            val1 = scan.nextInt();  //assign val1 to the input
                            
                            if ( (val1>=0) && (val1<=100) ) {   //check if val1 is within the range
                                    
                                    if ( b!= 0) {   //if b does not equal to 0
                                    
                                        if ( val1 > myList[b-1] ) { //check if the input is greater than the previous input
                                            myList[b] = val1;   //fill the array with val1
                                            i=0;    //end the loop
                                        }
                                        
                                        else {  //if the input is smaller than or equal to the previous number
                                            System.out.println("It should be greater than the previous integer. Enter again. ");    //print the error message and asks the user to enter input again
                                            scan.nextInt(); //clear the buffer
                                            b=1;    //continue the loop
                                        }
                                        
                                    }
                                    
                                    else {  //if b=0
                                        myList[b] = val1;   //assign the first number in the array
                                    }
                    
                            }
                            
                            else {  //if val1 is out of the range
                                System.out.println("It is out of range. Enter again. ");    //print the error message and asks the user to enter input again
                                scan.nextInt(); //clear the buffer
                                b=1;    //continue the loop
                            }
                        }
                    
                        
                        else {  //if inputs are not integers
                            System.out.println("The inputs are not integers. Enter again. ");   //print the error message and asks the user to enter input again
                            scan.next(); //clear the buffer
                            b=1;    //continue the loop
                        }
                    }
                
            }   //end of main loop
            
            //Show the sorted array
            System.out.println("The grades, sorted, are: ");    //print the explanation
  	        for ( b=0; b<myList.length; b++) {  //print the array
  	            System.out.print(myList[b] + " ");
  	        }
  	        System.out.println();
            
            
            System.out.print("Enter a grade to search for: ");  //prompt the user to enter a grade to search for
            int binaryGrade = scan.nextInt();   //assign binaryGrade to input
            
            
            //Show the result of binary search
            int bMethod = binarySearch (myList, binaryGrade);   //call the method
            if ( bMethod == -1 ) {  //if cannot find the number
                System.out.println(binaryGrade + " was not found in the list with 4 literations");  //show the message
            }
            
            else {  //if the number is found
                System.out.println(binaryGrade + " was found in the list with " + bMethod + " literations");    //print the informing message
            }
            
            //Show the result of scrambling array
            System.out.println("Scrambled:");   //print the messgae
            myList = scramble(myList);  //declare myList
            for ( c=0; c<myList.length; c++ ) { //create new array and print out
  	            System.out.print( myList[c] + " ");
  	        }
            System.out.println();
            
            System.out.print("Enter a grade to search for: ");  //prompt the user to enter a grade to search for
            int linearGrade = scan.nextInt();   //assign linearGrade to the input
            int lMethod = linearSearch (myList, linearGrade);   //call the method
            if ( lMethod == -1 ) {  //if the number is not found
                System.out.println(linearGrade + " was not found in the list with 15 literations"); //print the message
            }
            
            else {  //if the number is found
                System.out.println(linearGrade + " was found in the list with " + (lMethod+1) + " literations");    //print the message
            }
            

        
        }   //end of main method
        
        //The binarySearch method
        public static int binarySearch ( int[ ] list, int key ) {   //start of the method
            int low = 0;    //assign variable
            int high = list.length - 1; //assign variable
            int a = 0;  //assign variable
            
            while ( high >= low ) {
                int mid = (low + high) / 2; //assign the middle value
                if ( key < list[mid] ) {    //if the target is smaller than middle value
                    high = mid - 1;
                    a++;
                }
                else if ( key == list[mid] ){   //if the target is the middle value
                    a++;
                    return a;
                }
                else {  //if the target is greater than middle value
                    low = mid + 1;  
                    a++;
                }
            }
            
            return -1;  //not found
        }
        
        //The scamble method
        public static int [] scramble ( int [] sArray ) {   //start of the method
            Random rnd = new Random();  //generate random number
            //Shuffling the array
            for (int x = sArray.length-1; x>0; x--) {
                int index = rnd.nextInt(x+1);
                int y = sArray[index];
                sArray[index] = sArray[x];
                sArray[x] = y;
            }
            
            return sArray;  //return the result
        }
        
        //The linearSearch method
        public static int linearSearch ( int [] list, int key ) {   //start of the method
            for ( int z=0; z<list.length; z++) {    //check the whole array until find out the target
                if ( key== list[z] ) {
                    return z;   //return the index of the array
                }
            }
            
            return -1;  //not found
        }
  
    }   //end of class