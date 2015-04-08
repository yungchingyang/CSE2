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

    public class Try {  //define a class
        
        public static void main (String [ ] Args) {
            
            System.out.print("Please enter an integer for the size of an array: ");
            Scanner scan = new Scanner (System.in); //construct scanner
            int size;
            size = scan.nextInt();
            
            int [ ] myList = new int [size];
            
            for (int i = 0; i<myList.length; i++) {
                
                System.out.print(myList[i] + " ");
                
            }
            
            
        }
    }