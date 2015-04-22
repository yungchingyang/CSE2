//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//April 17 2015
//Multiply Java Program
//It is a program that prints out and operates on row- and column- major matrices represented by two dimensional arrays.

//  first compile the program
//      javac Multiply.java
//  run the program
//      java Multiply//
//    

   import java.util.Scanner;   //import Scanner
   import java.util.Random;    //import random number generator

    public class Multiply {  //define a class
    
        //The randomMatrix method    
        public static int [][] randomMatrix ( int width, int height ) { //start of randomMatrix class
            
            int [ ] [ ] matrix = new int [height] [width];  //declare variable for array
            
            //Fill the array with random numbers
            for ( height = 0; height < matrix.length; height++ ) {
                for ( width = 0; width < matrix[height].length; width++ ) {
                    matrix[height][width] = (int)((Math.random()*21)-10);
                }
            }
            
            return matrix;  //return the result of the method
            
        }   //end of the randomMatrix method
        
        
        //The printMatrix method
        public static void printMatrix ( int [ ] [ ] array ) {  //the start of printMatrix method
            
            //The for loop to print out the array
            for ( int row=0; row<array.length; row++ ) {
                for ( int column = 0; column<array[row].length; column++ ) {
                    System.out.print(array[row][column] + " ");
                }
                System.out.println();
            }
            
        }   //end of the printMatrix method
        
        
        //The matrixMultiply method
        public static int [][]matrixMultiply ( int[][] arrayA, int[][] arrayB) {    //the start of matrixMultiply method
            
            int aRows = arrayA.length;  //assign variable
            int aColumns = arrayA[0].length;    //assign variable
            int bRows = arrayB.length;  //assign variable
            int bColumns = arrayB[0].length;    //assign variable
            
            if ( (aRows==bColumns) && (bRows==aColumns) ) { //if the width of an array equals to the height of the other array
                
                int [][] finalArray = new int [aRows][bColumns];    //declare variable for array
                
                //Combine the two arrays and make a final array
                for (int i = 0; i < aRows; i++) { // aRow
                    for (int j = 0; j < bColumns; j++) { // bColumn
                        for (int k = 0; k < aColumns; k++) { // aColumn
                            finalArray[i][j] += arrayA[i][k] * arrayB[k][j];
                        }
                    }
                }

            return finalArray;  //return the result in the method
                
            }
            
            else {
                System.out.println("The dimensions are compatible for matrix multiplication. Restart.");
                return null;    //return result
            } 
            
            
        }   //end of the matrixMultiply method
        
        //The main method
        public static void main (String [] args) {  //the start of the the main method
            
            Scanner scan = new Scanner(System.in);  //construct the scanner
            
            int widthA = 0; //assign variable
            int heightA = 0;    //assign variable
            int widthB = 0; //assign variable
            int heightB = 0;    //assign variable
            
            //The main loop
            for ( int a=2; a>=1; a++ ) {
                
                //Ask for the first width
                System.out.print("Enter the width of the first matrix: ");  //ask the user for input
                for ( int b=2; b>=1; b++ ) { 
                    if ( scan.hasNextInt() ) {  //check if the input is integer
                        widthA = scan.nextInt();    //accept input and assign variable
                    
                        if ( widthA>0 ) {   //if the number is positive
                            break;  //break the loop
                        }
                        else {
                            System.out.print("It is not positive. Enter again. \n");    //print the error message
                            scan.nextInt(); //clear the buffer
                        }
                                
                    }
                    else {  //if the input is not an integer
                        System.out.print("Not integer. Enter again. \n");   //print the error message
                        scan.next();    //clear the buffer
                        b--;    //continue the loop
                    }
                }
                    
                //Ask for the first height
                System.out.print("Enter the height of the first matrix: "); //ask the user for input
                for ( int c=2; c>=1; c++ ) { 
                    if ( scan.hasNextInt() ) {  //check if the input is integer
                        heightA = scan.nextInt();   //accept input and assign variable
                            
                        if ( heightA>0 ) {  //if the number is positive
                            break;  //break the loop
                        }
                        else {  //if the number is negative
                            System.out.print("It is not positive. Enter again. \n");    //print the error message
                            scan.nextInt(); //clear the buffer
                        }
                    }
                     
                    else {  //if the input is not an integer
                        System.out.print("Not integer. Enter again. \n");   //print the error message
                        scan.next();    //clear the buffer
                        c--;    //continue the loop
                    }
                }
                
                //Ask for the second width
                System.out.print("Enter the width of the second matrix: "); //ask the user for input
                for ( int d=2; d>=1; d++ ) { 
                    if ( scan.hasNextInt() ) {  //check if the input is integer
                        widthB = scan.nextInt();    //accept input and assign variable
                            
                        if ( widthB>0 ) {   //if the number is positive
                            break;  //break the loop
                        }
                        else {  //if the number is negative
                            System.out.print("It is not positive. Enter again. \n");    //print the error message
                            scan.nextInt(); //clear the buffer
                        }
                    }
                     
                    else {  //if the input is not an integer
                        System.out.print("Not integer. Enter again. \n");   //print the error message
                        scan.next();    //clear the buffer
                        d--;    //continue the loop
                        }
                }
                
                //Ask for the second height
                System.out.print("Enter the height of the second matrix: ");    //ask the user for input
                for ( int e=2; e>=1; e++ ) { 
                    if ( scan.hasNextInt() ) {  //check if the input is integer
                        heightB = scan.nextInt();   //accept input and assign variable
                        
                        if ( heightB>0 ) {  //if the number is positive
                            break;  //break the loop
                        }
                        else {  //if the number is negative
                            System.out.print("It is not positive. Enter again. \n");    //print the error message
                            scan.nextInt(); //clear the buffer
                        }
                    }
                     
                    else {  //if the input is not an integer
                        System.out.print("Not integer. Enter again. \n");   //print the error message
                        scan.next();    //clear the buffer
                        e--;    //continue the loop
                    }
                }
                
                //Check if the dimensions are compatible for matrix multiplication
                if ( (widthA==heightB) && (widthB==heightA) ) { //if the width of an array equals to the height of the other array
                    a=0;    //stop the loop
                    break;  //break the loop
                } 

                else {  //if the width of an array does not equal to the height of the other array
                    System.out.println("The dimensions are compatible for matrix multiplication. Restart.");    //print the error message
                }
                
            }
            
            int [] [] arrayA = randomMatrix(widthA, heightA);   //call method and declare arrayA
            System.out.println("The first array is ");  //print the message
            printMatrix(arrayA);    //call the method to print array
            
            int [] [] arrayB = randomMatrix(widthB, heightB);   //call method and declare arrayB
            System.out.println("The second array is "); //print the message
            printMatrix(arrayB);    //call the method to print array
            
            int [] [] finalArray = matrixMultiply( arrayA, arrayB );    //call method and declare finalArray
            System.out.println("The product matrix is ");   //print the message
            printMatrix(finalArray);    //call the method to print array
            
            
        }   //end of main method
        
    }   //end of the class