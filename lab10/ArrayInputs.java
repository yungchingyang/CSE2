//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//April 3 2015
//Array Inputs Java Program
//It is a program that creates array.
//
//  first compile the program
//      javac ArrayInputs.java
//  run the program
//      java ArrayInputs//
//    
//

    import java.util.Scanner;   //import Scanner

    public class ArrayInputs {  //define a class
        
        public static void main (String [ ] Args) { //start the main method

            
                System.out.print("Please enter an integer for the size of an array: "); //prompt the user to enter the size of array
                Scanner scan = new Scanner (System.in); //construct scanner
                int size;   //declare variable
                int number; //declare variable
                int a=0;    //declare variable
            
                for ( int i=1; i>=1; i++) { //start the main loop
                    if ( scan.hasNextInt() ) {  //check if input is integer
                        size = scan.nextInt();  //assign variable to input
                    
                        if ( size > 0 ) {   //if the size is positive
                                
                            System.out.print("Please enter " + size + " positive integer:");    //prompt the user to put inputs
                            
                                int [ ] myList = new int[size]; //declare array
                            
                                for ( a=0; a<myList.length; a++) {  //fill the array with numbers
                                
                                    if ( scan.hasNextInt() ) {  //check if the inputs are integers
                                        myList[a] = scan.nextInt(); //put numbers into array
                                    }
                                    
                                    else {  //if the inputs are not integers
                                        System.out.println("Sorry, you didn't enter an integer.");  //show the error message
                                        scan.next();    //clear the buffer
                                        System.out.print("Please enter positive integers: ");   //prompt the user to enter again
                                        a--;    //recount
                                        i++;    //continue the loop
                                    }
                                }
                                
                                System.out.println("The array is:" );   //show the array
                                
                                for ( int b=0; b<myList.length; b++) {  //show the numbers in array
                                    System.out.println(myList[b]);
                                }
          
                                i = 0;  //break the loop
                                break;
  
                        }
                    
                        else {
                            System.out.println("Sorry, the number you entered is negative.");   //if the size number is negative
                            i++;    //continue the loop
                    
                        }
                    
                    }
            
                    else {
                        System.out.println("Sorry, you didn’t enter an integer.");  //show the error message
                        scan.next();    //clear the buffer
                        System.out.print("Please enter a positive integer: ");  //ask the user to enter number again
                        i++;    //continue the loop
                    }
                }   //end of main loop
            
            
            
        }   //end of main method

    }   //end of the class