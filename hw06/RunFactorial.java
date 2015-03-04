//////////////////////////////
//Yung Ching Yang
//February 27 2015
//Run Factorial Java Program
//It is a program that solves factorial problem using while loop
//  first compile the program
//      javac RunFactorial.java
//  run the program
//      java RunFactorial//
//
    import java.util.Scanner;   //import scanner
//    
    public class RunFactorial {   //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
//
            Scanner myScanner;  //to accept input
            myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
            
           
            int num;    //declare variable for user input
            int factorial = 1;  //declare result of factorial
            int i = 1;  //declare number
            int set = 1;    //declare manipulating variable
            
            System.out.print("Please enter an integer that is between 9 and 16: \n");   //prompt user to input a number between 9 and 16
            
            while ( set >= 1 ) {    //start of the loop
                
                if ( myScanner.hasNextInt() ) { //check whether the input is integer or not
                    num = myScanner.nextInt();  //assign num to the input
                    
                    if ( (num >= 9) & (num <= 16) ){    //enter the condition if the number is between 9 and 16
                        
                        //do the factorial calculation
                        while ( i <= num ) {    
                            factorial *= i;
                            i++;
                        }
                        
                        //print out the result message
                        System.out.println("Input accepted:");
                        System.out.println(num + "!= " + factorial);
                        set=0;  //end the loop
                
                    }
                    
                    else {  //enter the condition if the input is not between 9 and 16
                            System.out.print("Invalid input, enter again! \n"); //prompt the user to enter valid input
                            set++;  //continue the loop
                    }
                
                }

                else {  //enter the condition if the input is not an integer
                        System.out.print("Invalid input, enter again! \n"); //prompt the user to enter valid input
                        myScanner.next();   //clear the previous input
                        set++;  //continue the loop
                }
                
                
            }
            
        }   //end of the main method
    }   //end of the class