//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//March 6 2015
//Waves Java Program
//It is a program that forces the user to enter an integer between 1 and 30, inclusive, and then prints out 
//displays that depend on the value entered and look like waves.

//
//  first compile the program
//      javac waves.java
//  run the program
//      java waves//
//    
//

    import java.util.Scanner;   //import Scanner

    public class testPractice {  //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
        
            //Upper pyramid
            for ( int i = 1; i <=5; i++) {
                for ( int j = 0; j<i; j++) {
                    System.out.print(i);
                }
                System.out.println("");
            }
            
            //Lower Pyramid
            for ( int i = 5; i>=1 ; i--) {
                for ( int j = 0; j<i; j++ ) {
                    System.out.print(i);
                }
                System.out.println("");
            }
            
            //12345 Upper Pyramid
            for ( int i = 1; i <=5; i++) {
                for ( int j = 0; j<i; j++) {
                    System.out.print(j+1);
                }
                System.out.println("");
            }
            
            //12345 Lower Pyramid
            for ( int i = 5; i >=1; i--) {
                for ( int j = 5; j>=i; j--) {
                    System.out.print(j);
                }
                System.out.println("");
            }
            
            
        }   //end of main method
    }   //end of class    