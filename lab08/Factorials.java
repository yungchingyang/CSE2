//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//March 20 2015
//Factorials Java Program
//It is a program that calls three different methods to calculate super factorials

//
//  first compile the program
//      javac Factorials.java
//  run the program
//      java Factorials//
//  
    
    import java.util.Scanner;   //import Scanner
    
    public class Factorials {   //define a class
    
        //Main Method
        public static void main (String[ ] args ) { //call the main method
            
            Scanner scan = new Scanner( System.in );    //construct an instance of the Scanner class
            
            int n = scan.nextInt(); //declare the input as n
            int sum = 0;    //declare the integer sum
            
            for (int i=1; i<=n; i++) {  //start the for loop
                sum += factorial(i);    //plus the factorials to get super factorials
            }
            
            print(sum); //give the output of sum
            
        }   //end of main method
        
        //Second method
        public static int factorial (int key) { //call the second method
            
            int mul = 1;    //declare the variable mul
            
            for (int i=1; i<=key; i++ ) {   //start the for loop
                mul*=i; //multiply the numbers to get factorial
            }
            
            System.out.println(mul);    //print out the value of mul
            return mul; //set mul as an output
            
        }   //end of the second method
        
        //Third method
        public static void print (int num) {    //call the third method
            
            System.out.println("The super factorial is equal to " + num);   //print out the message that shows the super factorial
            
        }   //end of third method
        
    }   //end of the class