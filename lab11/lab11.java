//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//April 10 2015
//Lab 11 Java Program
//It is a program that creates array.
//
//  first compile the program
//      javac lab11.java
//  run the program
//      java lab11//
//    
//
    import java.util.Random;
    import java.util.Scanner;   //import Scanner

    public class lab11 {  //define a class
        
        public static void main (String [ ] Args) {
            
            Random rnd = new Random();  //construct the random number generator
            Scanner scan = new Scanner(System.in);
            
            int [] array1 = new int [50];   //declare an array
            int [] array2 = new int [50];
            int max1 = 0;
            int min1 = 0;
            int max2 = 0;
            int min2 = 0;
            
           //Create array 1
            for ( int a = 0; a<array1.length; a++ ) {
                array1[a] = rnd.nextInt(101);
                System.out.println(array1[a]);
            }
            
            
             //Finding maximum for array 1
            for ( int a=0; a<array1.length; a++) {
                array1[a] = max1;
                
                for ( int b=a+1; b<array1.length; b++) {
                    if (array1[b] > max1) {
                        max1 = array1[b];
                    }
                }
            }
            
            //Finding minimum for array 1
     
                
                for ( int c=1; c<array1.length; c++) {
                    if (array1[c] < min1) {
                        min1 = array1[c];
                    }
                }
            
            
            
            
            
            
            
            
            
            
            System.out.println("The maximum of array1 is: " + max1);
            System.out.println("The minimum of array1 is: " + min1);
            
            
            
            System.out.println("The maximum of array2 is: " + max2);
            System.out.println("The minimum of array2 is: " + min2);
            
            System.out.println("Enter an int:");
            
            
            
            
            
            
            
        }   //end of main method
    }   //end of the class