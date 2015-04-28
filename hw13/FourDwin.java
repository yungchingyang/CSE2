//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//April 24 2015
//Four Dwin Java Program
//It is a program that creates multidimensional array.
//
//  first compile the program
//      javac FourDwin.java
//  run the program
//      java FourDwin//
//    
//
    import java.util.Random;    //import random number generator
    import java.util.Scanner;   //import Scanner

    public class FourDwin {  //define a class
        
        //The start of statArray method
        public static void statArray ( double [] [] [] [] array ) {
            
            
            System.out.println("Members: " + members);
            System.out.println("Sum:     " + sum);
            System.out.println("Mean:    " + mean);

        }   //the end of statArray method
        
        
        //The start of sort4DArray method
        public static double [] [] [] [] sort4DArray ( double [] [] [] [] array ) {
            
            
        }   //the end of sort4DArray
        
        
        //The start of sort3DArray method
        public static double [] [] [] sort3DArray ( double [] [] [] array ) {
            
        }   //the end of sort3DArray
        
        
        //The start of printArray method
        public static void printArray ( double [] [] [] [] array) {
            
            System.out.print("{");
            for ( int outer = 0; outer < 3; outer++ ) {
                System.out.print("{");
                for ( int middle = 0; middle < array[outer].length; middle++ ) {
                    System.out.print("{");
                    for ( int variableX = 0; variableX < array[outer][middle].length; variableX++ ) {
                        System.out.print("{");
                        for ( int variableY = 0; variableY < array[outer][middle][variableX].length; variableY++ )
                            
                            if ( variableY > 1) {
                                System.out.print(", ");
                            }
                            
                            System.out.print( array [outer][middle][variableX][variableY] );
                        
                        }
                        System.out.print("}");
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            System.out.println("}");
            
        }   //the end of printArray method
        
        
        //The start of main method
        public static void main (String [ ] Args) {
            
            int variableX = 0;
            int variableY = 0;
        
            for ( int i=2; i>1; i++) {
                System.out.print("Enter an integer X: ");
                Scanner scan = new Scanner (System.in);
            
                if ( scan.hasNextInt() ) {
                    variableX = scan.nextInt();
                    break;
                }
            
                else {
                    System.out.print("Invalid input. Please enter an integer X: ");
                    scan.next();
                    i--;
                }
            }
        
            for ( int j=2; j>1; j++) {
                System.out.print("Enter an integer Y where Y > X: ");
                scan = new Scanner (System.in);
            
                if ( scan.hasNextInt() ) {
                    variableY = scan.nextInt();
                
                    if ( variableY > variableX) {
                        break;
                    }
                
                    else {
                        System.out.print("Invalid input. Please enter an integer for Y > X: ");
                        scan.nextInt();
                        j--;
                    }
                
                }
            
                else {
                    System.out.print("Invalid input. Please enter an integer for Y > X: ");
                    scan.next();
                    j--;
                }
            }
        
        
            int middle = (int)((Math.random()*(variableY-variableX+1)) + variableX);
        
            double [ ] [ ] [ ] [ ] array = new double [outer] [middle] [variableX] [variableY] ;  //declare variable for array
        
            //Create array
            for ( int outer = 0; outer < 3; outer++ ) {
                for ( int middle = 0; middle < array[outer].length; middle++ ) {
                    for ( int variableX = 0; variableX < array[outer][middle].length; variableX++ ) {
                        for ( int variableY = 0; variableY < array[outer][middle][variableX].length; variableY++ )
                    
                            array[outer][middle][variableX][variableY] = (double)((Math.random()*31));
                        
                        }
                    }
                }
            }
            
            System.out.println("");
            System.out.println("Original Array: ");
            printArray( array );
            System.out.println("");
            System.out.println("Sorted Array: ");
            printArray( sort4DArray );
            System.out.println("");
            statArray( array );

        
        }   //end of the main method
        
    }   //end of the class