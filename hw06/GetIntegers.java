//////////////////////////////
//Yung Ching Yang
//February 27 2015
//Get Integers Java Program
//It is a program that asks the user for 5 non-negative integers, and prints out the sum of the 5 integers
//  first compile the program
//      javac GetIntegers.java
//  run the program
//      java GetIntegers//
//
    import java.util.Scanner;   //import scanner
//    
    public class GetIntegers {   //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
//
            Scanner myScanner;  //to accept input
            myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
                    
            
            System.out.print("Please enter 5 non-negative integers: \n");   //prompt the user to enter inputs
            
            int num1, num2, num3, num4, num5;   //declare for variables num1, num2, num3, num4, num5
            int i;  //declare manipulating variable
            
            for ( i=2; i<=2; i++ ) {    //the start of loop
            
                if ( myScanner.hasNextInt() ) { //check whether input is an integer
                    num1 = myScanner.nextInt(); //assign num1 to input
                    
                    if ( num1>=0 ) { //check whether num 1 is non-negative
                        
                        if ( myScanner.hasNextInt() ){  //check whether the input is an integer
                            num2 = myScanner.nextInt(); //assign num2 to input
                            
                            if ( num2>=0 ) { //check whether num2 is non-negative
                        
                                if ( myScanner.hasNextInt() ) { //check whether the input is an integer
                                    num3 = myScanner.nextInt(); //assign num 3 to input
                                    
                                    if ( num3>0 ) { //check whether num is non-negative
                            
                                        if ( myScanner.hasNextInt() ) { //check whether the input is an integer
                                            num4 = myScanner.nextInt(); //assign num4 to input
                                            
                                            if ( num4>0 ) {     //check whether num4 is non-negative
                                
                                                if ( myScanner.hasNextInt() ) { //check whether num5 is an integer
                                                    num5 = myScanner.nextInt(); //assign num5 to the input
                                                    
                                                    if ( num5>0 ) { //check whether num is non-negative
  
                                                        System.out.println("Sum is " + (num1 + num2 + num3 +num4 + num5) ); //print out the sum of 5 input numbers
                                                        i++;    //used to end the loop
                                                    }
                                                    
                                                    else {  //if num5 is negative
                                                        System.out.print("Invalid input, enter again \n");  //print the reenter message
                                                        i--;    //continue the loop
                                                    }
                                                
                                                }
                                                
                                                else {  //if num5 is not an integer
                                                    System.out.print("Invalid input, enter again \n");  //print the reenter message
                                                    myScanner.next();   //clear the inputs before
                                                    i--;        //continue the loop
                                                }
                                            
                                            }
                                            
                                            else {  //if num4 is negative
                                                System.out.print("Invalid input, enter again \n");  //print the reenter message
                                                i--;    //continue the loop
                                            }
                                    
                                        }
                                        
                                        else {  //if num4 is not an integer
                                            System.out.print("Invalid input, enter again \n");  //print the error message
                                            myScanner.next();   //clear the previous inputs
                                            i--;    //continue the loop
                                        }
                                        
                                    }
                
                                    else {  //if num3 is negative
                                        System.out.print("Invalid input, enter again \n");  //print the reenter message
                                        i--;    //continue the loop
                                    }
                                
                                }
                                
                                else {  //if num 3 is not an integer
                                    System.out.print("Invalid input, enter again \n");  //print the reenter message
                                    myScanner.next();   //clear th eprevious inputs
                                    i--;    //continue the loop
                                }
                                
                            }
                            
                            else {  //if num2 is negative
                                System.out.print("Invalid input, enter again \n");  //print the reenter message
                                i--;    //continue the loop
                            }
                                
                        }
                        
                        else {  //if num2 is not an integer
                            System.out.print("Invalid input, enter again \n");  //print the reenter message
                            myScanner.next();   //clear the previous inputs
                            i--;    //continue the loop
                        }
                    
                    }
                    
                    else {  //if num1 is positive
                        System.out.print("Invalid input, enter again \n");  //print the reenter message
                        i--;    //continue the loop
                    }
                
                }
            
                else {  //if num1 is not an integer
                    System.out.print("Invalid input, enter again \n");  //print the reenter message
                    myScanner.next();   //clear the previous inputs
                    i--;    //continue the loop
                }
            }
            
            
             
        }   //end of the main method
    }   //end of the class