//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//February 27 2015
//Make Symbols Java Program
//It is a program that if the input number is even, it will then print out that number of “*” characters;
//if the input number is odd, then it will print out that number of “&” characters. 
//
//  first compile the program
//      javac MakeSymbols.java
//  run the program
//      java MakeSymbols//
//    
//
    public class MakeSymbols {  //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
        
            int number = (int)(Math.random()*100);   //produce the random number between 0 to 100
            
            System.out.println("Random number generated:" + number);    //print the chosen random number
            System.out.print("The output pattern: ");   //show the output pattern
            
            if ( (number%2) == 0 ) {    //in the condition if the number is even
                int a = 0;  //assign count
                do {    //do the following statement first
                    System.out.print("*");  //print out "*"
                    a++;    //increase the count
                } while ( a < (number-1) ); //decide when to stop the loop
                System.out.println("*");    //print out the last "*"
                
            } 
            
            if ( (number%2) == 1 ) {    //in the condition if the number is odd
                int b = 0;  //assign count
                do {    //do the following statement first
                    System.out.print("&");  //print out "&"
                    b++;    //increase the count
                } while ( b < (number-1) ); //decide when to stop the loop
                System.out.println("&");    //print out the last "&"
                
            } 
            
            
        }   //end of main methos
    }   //end of the class