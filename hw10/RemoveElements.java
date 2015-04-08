//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//April 3 2015
//Remove Elements Java Program
//It is a program that manipulates arrays and in writing methods that have array parameters.
//
//  first compile the program
//      javac RemoveElements.java
//  run the program
//      java RemoveElements//
//    
//
    
    import java.util.Scanner;   //import Scanner
    import java.util.Random;    //import random number generator

    public class RemoveElements {  //define a class
        
        public static void main (String [ ] Args) { //main method
            
            Scanner scan = new Scanner(System.in);  //construct scanner
            
            int num[] = new int[10];    //declare array
            int newArray1[];    //declare array
            int newArray2[];    //declare array
            int index,target;   //declare variables
	        String answer="";   //declare variables
	        int k=0;    //declare variable
	        int w=0;    //declare variable
	        
	        for ( int z=1; z>=1; z++) { //for loop to run the program
	        
	        do{ //do-while loop for the program
	            
	            System.out.print("Random input 10 ints [0-9]"); //show message
	            System.out.println(""); //change to next line
  	            
  	            num = randomInput();    //assign random numbers
  	            String out = "The original array is:";  //print out message
  	            out += listArray(num);  //add words
  	            
  	            System.out.println(out);    //print the orogonal array
 
  	            System.out.print("Enter the index ");   //print the message
  	            
  	            if ( scan.hasNextInt() ) {  //check if input is an integer
  	            
  	                index = scan.nextInt(); //assign variable
  	                
  	                if ( index>=0 ) {   //check if it is greater than 0
  	                    
  	                    if ( index<=10 ) {  //check if it is smaller than 10
  	                        newArray1 = delete(num,index);  //call the method
  	            
  	                        String out1 = "The output array is ";   //print the message
  	                        out1 += listArray(newArray1); //return a string of the form "{2, 3, -9}"
  	            
  	                        System.out.println(out1);   //print the array
 
                            System.out.print("Enter the target value ");    //print the message
                        
                            if ( scan.hasNextInt() ) {  //check if the input is integer
  	                            target = scan.nextInt();    //assign variable
  	                        
  	                            if ( target>=0 ) {  //if it is greater than 0
  	                                
  	                                if ( target<=9) {   //if it is smaller than 9
  	                                    
  	                                    for ( w=0; w<newArray1.length; w++) {   //check if there is the asked number in the array
  	                                        
  	                                        if ( newArray1[w] == k ) {
  	                                        k++;
  	                                        }
  	                                    }
  	                                    
  	                                    if ( k>0 ) {    //if there is the number
  	                            
  	                                        System.out.println("Element " + target + " has been found.");   //print the message
  	                            
  	                                        newArray2 = remove(num,target); //call the remove method
  	                                        String out2="The output array is "; //print the message
  	                                        out2 += listArray(newArray2); //return a string of the form "{2, 3, -9}"
  	            
  	                                        System.out.println(out2);   //print the array
  	 
  	                                        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-"); //ask if the user want to continue
  	            
  	                                        answer=scan.next(); //accept input
  	                                    
  	                                    }
  	                                     
  	                                 
  	                                    
  	                                    else {
  	                                        System.out.println("Element " + target + " was not found.");    //print the message
  	                                    }
  	                                 
  	                                }
  	                                    
  	                                 else {
  	                                     System.out.println("Element " + target + " was not found.");   //print the message
  	                                 }
  	                        
  	                            }
  	                        
  	                            else {
  	                                System.out.println("Element " + target + " was not found.");    //print the message
  	                            }
  	                    
                            }
                            
                            else {
                                System.out.println("It is not an integer.");    //print the message
                                scan.nextInt(); //clear the input
                            }
                        
                        }
                        
                        else {
                            System.out.println("The index is not valid.");  //print the message
                        }
  	                
  	                }
  	                
  	                else {
  	                    System.out.println("The index is not valid. "); //print the message
  	                }
  	            
  	            }
  	            
  	            else {
  	                System.out.println("It is not an integer.");    //print the message
  	                scan.nextInt(); //clear the input
  	            }
  	            
            } while (answer.equals("Y") || answer.equals("y")); //condition to continue
            
	        }   //end of for loop
            
        }   //end of the main method

        // The start of listArray method
        public static String listArray(int num[]) { //create the array
            
	        String out="{";
	        
	        for ( int j=0; j<num.length; j++) {
  	            if ( j>0 ) {
    	            out += ", ";
  	            }
  	            out += num [ j ];
	        }
	        
	        out += "} ";
	        
	        return out;
	        
        }   //end of the listArray method
        
        //The start of randomInput method
        public static int [] randomInput() {
            
            Random randomGenerator = new Random();  //construct the random number generator
            
            int [] randomList = new int [10];   //declare an array
            
            for ( int i=0; i<randomList.length; i++) {  //fill the array with random numbers
                randomList[i] = randomGenerator.nextInt(10);
            }
            
            return randomList;  //return the result
            
        }   //end of the randomInput method
        
        //The start of delete method
        public static int [] delete ( int [] list, int pos ) {
            
            int [] myList = new int [list.length-1];    //resize the array
            
            for ( int x=0; x<myList.length; x++ ) { //reassign the numbers in the array
                if ( x< pos ) {
                    myList [x] = list [x];
                }
                
                else if ( x >= pos) {   //reassign the numbers in the array
                    myList [x] = list [x+1];
                }
            }
            
            return myList;  //return the result
            
        }   //the end of delete method
        
        //The start of remove method
        public static int [] remove ( int [ ] list, int target ) {
            
            int c = 0;  //declare variable
            int d = 0;  //declare variable
            
            for ( int b=0; b<=list.length; b++) {   //count how many asked numbers in the array
                if ( list[b]==target) {
                    c++;
                }
            } 
            
            int [] lastList = new int [list.length-c];  //resize the array
            
            for ( int y=0; y<lastList.length; y++ ) {   //reassign the numbers in array
                if ( lastList[y] == target ) {
                    lastList[y] = list[y+d];
                    d++;
                }
                
                else {
                    lastList[y] = list[y+d];    //reassign the numbers in array
                }
            }
            
            return lastList;    //return the result
            
        }   //the end of the remove method
        
    }   //end of the class   