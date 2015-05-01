//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//April 17 2015
//Lab 12 Java Program
//It is a program that prints out and operates on row- and column- major matrices represented by two dimensional arrays.

//  first compile the program
//      javac lab12.java
//  run the program
//      java lab12//
//    

   import java.util.Scanner;   //import Scanner
   import java.util.Random;

    public class lab12 {  //define a class
        
        // The increasingMatrix method
        public static int [] [] increasingMatrix( int width, int height, boolean format ) {
            
            if ( format = true ) {
                
                int [][] matrix = new int [width] [height];
                
                for ( width=0; width<matrix.length; width++ ) {
                    for ( height=0; height<matrix[width].length; height++ ) {
                        matrix[width][height] = 
                    }
                }
                
                int total = width*height;
                int start = 0;
                int width = 0;
                
                while ( start<= total) {
                    matrix[width][height]  = " " + start;
                    start++;
                    height++;
                    if ( height >= matrix[width].length ) {
                        height = 0;
                        width++;
                    }
                }
            }
            
            else {
                
                int matrix = new int [height] [width];
                
                for (int height=0; height<matrix.length; height++ ) {
                    for (int width=0; width<matrix[height].length; width++ ) {
                        matrix[height][width] = input.nextInt();
                    }
                }
            }
            
            return matrix;
            
        }   //end of increasingMatrix method
        
        //Start of printMatrix method
        public static void printMatrix( int[][]array, boolean format ) {
            
            if  ( format==true ) {
                for ( int row = 0; row < array.length; row++ ) {
                    for ( int column = 0; column<array[row].length; column++ ) {
                        System.out.print(array[row][column] + " ");
                    }
                    System.out.println();
                }
            }
            
            else if  ( format==false ) {
                for ( int column = 0; column < array.length; column++ ) {
                    for ( int row = 0; row<array[row].length; row++ ) {
                        System.out.print(array[column][row] + " ");
                    }
                    System.out.println();
                }
            }
            
            else if ( array==null ) {
                System.out.println("The array was empty!");
            } 
            
        }   //end of printMatrix method
        
        
        //Start of the translate method
        public static void translate ( int[][] array ) {
            
        }   //end of translate method
        
        
        //Start of the addMatrix method
        public static int [] [] addMatrix ( int [] [] a, boolean formata, int[][]b, boolean formatb) {
            
        }   //end of the addMatrix method
        
        
        //Start of main method
        public static void main (String [ ] Args) { //start the main method
        
            int width1 = (int)(Math.random()*21);
            int height1 = (int)(Math.random()*21);
            int width2 = (int)(Math.random()*21);
            int height2 = (int)(Math.random()*21);
            
            int [] [] matrixA = increasingMatrix(width1, height1, true);
            int [] [] matrixB = increasingMatrix(width1, height1, false);
            int [] [] matrixC = increasingMatrix(width2, height2, true);
            
            System.out.println("Generating a matrix with width " + width1 + " and height " + height1 + ": ");
            printMatrix(matrixA, true);
            System.out.println("Generating a matrix with width " + width1 + " and height " + height1 + ": ");
            printMatrix(matrixB, false);
            System.out.println("Generating a matrix with width " + width2 + " and height " + height2 + ": ");
            printMatrix(matrixC, true);
            System.out.println("Adding two matrices.");
            printMatrix(matrixA, true);
            System.out.println("plus");
            printMatrix(matrixB, false);
            System.out.println("Translating column major to row major input. ");
            System.out.println("output: ");
            
        
        }   //end of main method
    }   //end of the class
