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

    public class lab12 {  //define a class
        
        // The increasingMatrix method
        public static int increasingMatrix( int width, int height, boolean format ) {
            
            if ( format = true ) {
                
                int [][] matrix = new int [width] [column];
                
                for (int row=0; row<matrix.length; row++ ) {
                    for (int column=0; column<matrix[row].length; column++ ) {
                        matrix[row][column] = input.nextInt();
                    }
                }
                
                int total = width*column;
                int start = 0;
                int row = 0;
                
                while ( start<= total) {
                    matrix[row][column]  = " " + start;
                    start++;
                    column++;
                    if ( column >= matrix[width].length ) {
                        column = 0;
                        row++;
                    }
                } 
            
            else {
                
                for (int column=0; column<matrix.length; column++ ) {
                    for (int row=0; row<matrix[column].length; row++ ) {
                        matrix[column][row] = input.nextInt();
                
            }
            
            return matrix;
            
        }   //end of increasingMatrix method
        
        public static void printMatrix( int[][]array, boolean format ) {
            
            if  ( format==true ) {
                for ( int row = 0; row < matrix.length; row++ ) {
                    for ( int column = 0; column<matrix[row].length; column++ ) {
                        System.out.print(matrix[row][column] + " ");
                    }
                    System.out.println(;)
                }
            }
            
            else if  ( format==false ) {
                for ( int column = 0; column < matrix.length; column++ ) {
                    for ( int row = 0; row<matrix[row].length; row++ ) {
                        System.out.print(matrix[column][row] + " ");
                    }
                    System.out.println(;)
                }
            }
            
            else if ( array==null ) {
                System.out.println("The array was empty!");
            } 
            
        }   //end of printMatrix method
        
        public static void translate ( int[][] array ) {
            
        }   //end of translate method
        
        
        
        public static void main (String [ ] Args) { //start the main method
        
        }   //end of main method
    }   //end of the class
