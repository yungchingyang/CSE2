//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//April 24 2015
//Lab 13 Java Program
//It is a program that gives us practice with elementary array operations, with ragged arrays, and with sorting.
//
//  first compile the program
//      javac lab13.java
//  run the program
//      java lab13//
//    
//
    import java.util.Random;
    import java.util.Scanner;   //import Scanner

    public class lab13 {  //define a class
    
        public static void main (String [] Args) {
    
            int row = 5;
            int j =  (row*3) + 5;
            int [] [] array = new int [row] [j];
            
            //Create the array
            for ( row = 0; row < 5; row ++ ) {
                for ( j = 0; j < (row*3) + 5; j++ ) {
                    
                    array[row][j] = (int)(Math.random()*40);
                    
                }

            }
            
            //Print the array
            System.out.println("The array before sorting ");
            for ( row = 0; row < 5; row ++ ) {
                System.out.print("row " + (row+1) + ": ");
                for ( j = 0; j < (row*3) + 5; j++ ) {
                    
                    System.out.print(array[row][j] + " ");
                    
                }
                System.out.print("\n");
            }
            
            //Sort the array
            for ( row = 0; row < 5; row ++ ) {
                for ( j = 0; j < (row*3) + 5; j++ ) {
                    
                    int temp = array[row][j];
                    int k;
                    for ( k =j-1; k>=0 && temp < array[row][k]; k-- ) {
                        array[row][k + 1] = array[row][k];
                        
                    }
                    array[row][k + 1] = temp;
                    
                }

            }
            
            //Print the sorted array
            System.out.println("");
            System.out.println("The array after sorting ");
            for ( row = 0; row < 5; row ++ ) {
                System.out.print("row " + (row+1) + ": ");
                for ( j = 0; j < (row*3) + 5; j++ ) {
                    
                    System.out.print(array[row][j] + " ");
                    
                }
                System.out.print("\n");
            }
            
            //Create a new array
            int row2 = 5;
            int l =  (row*3) + 5;
            int [] [] array2 = new int [row2] [l];

            for( row2 = 0; row2 < array.length; row2++){
                array2[row2] = new int[array2[row2].length];
                for ( l = 0; l < array[row2].length; l++) {
                    array2[row2][l] = array[row2][l];
                }
            }

            
            //Print array
            System.out.println("");
            System.out.println("The array after sorting and copying ");
            for ( row2 = 0; row2 < array.length; row2 ++ ) {
                System.out.print("row " + (row2+1) + ": ");
                for ( l = 0; l <  array[row2].length; l++ ) {
                    
                    if ( l<17) {
                        System.out.print(array2[row2][l] + " ");
                    }
                }
                
                
                System.out.print("\n");
            }
            
    
        }   //end of main method
    
    }   //end of a class
        