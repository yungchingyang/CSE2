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
            
            int outer = array.length;   //declare variable
            int members = 0;    //declare variable
            double sum = 0; //declare variable
            
            //Finding members
            for ( outer = 0; outer < 3; outer++ ) {
                for ( int middle = 0; middle < array[outer].length; middle++ ) {
                    for ( int variableX = 0; variableX < array[outer][middle].length; variableX++ ) {
                        for ( int variableY = 0; variableY < array[outer][middle][variableX].length; variableY++ ) {
                            members++;
                        }
                    }
                }
            }
            
            //Finding sum
            for ( outer = 0; outer < 3; outer++ ) {
                for ( int middle = 0; middle < array[outer].length; middle++ ) {
                    for ( int variableX = 0; variableX < array[outer][middle].length; variableX++ ) {
                        for ( int variableY = 0; variableY < array[outer][middle][variableX].length; variableY++ ) {
                            sum += array[outer][middle][variableX][variableY];
                        }
                    }
                }
            }
            
            //Finding mean
            double mean = (sum/members);
            
            System.out.println("Members: " + members);  //show the members in the array
            System.out.println("Sum:     " + sum);  //show the sum of the array
            System.out.println("Mean:    " + mean); //show the mean of the array

        }   //the end of statArray method
        
        
        //The start of sort4DArray method
        public static double [] [] [] [] sort4DArray ( double [] [] [] [] array ) {
            
            int [] arrayIndex = new int [array.length];
            double [] [] [] [] sortedArray = array;
            int total = 0;
            int i=0;
            
            for ( i=1; i < array.length; i++ ) {
                total = i;
                int num = array[i].length;
            }
            
            arrayIndex[i-1] = total;
            
            for ( int x = 0; x<3; x++ ) {
                sortedArray[x] = array[arrayIndex[x]];
            }
            
            return sortedArray;
            
        }   //the end of sort4DArray
        
        
        //The start of sort3DArray method
        public static double [] [] [] [] sort3DArray ( double [] [] [] [] array ) {
            
            double sortedArray [] [] [] [] = array;
            int outer = array.length;
            int middle = array[outer].length;
            int variableX = array[outer][middle].length;
            int variableY = array[outer][middle][variableX].length;
            
            
            for ( int outer2 = 0; outer2 < 3; outer2++ ) {
                for ( int middle2 = 0; middle2 < middle; middle2++ ) {
                    for ( int variableX2 = 0; variableX2 < variableX; variableX2++ ) {
                        for ( int variableY2 = 1; variableY2 < variableY - 1; variableY++ ) {
                            double currentMin = array[outer2][middle2][variableX2][variableY2];
                            int currentMinIndex = variableY2;
                            
                            for ( int j = variableY2 + 1; j < variableY; j++ ) {
                                if ( currentMin > array[outer2][middle2][variableX2][j]) {
                                    currentMin = array[outer2][middle2][variableX2][j];
                                    currentMinIndex = j;
                                }
                                
                            }
                            
                            if ( currentMinIndex != variableY2 ) {
                                array[outer2][middle2][variableX2][currentMinIndex] = array[outer2][middle2][variableX2][variableY2];
                                array[outer2][middle2][variableX2][variableY2] = currentMin;
                            } 
                                
                        }
                    }
                }
            }
            
            return array;
            
        }   //the end of sort3DArray
        
        
        //The start of printArray method
        public static void printArray ( double [] [] [] [] array) {
            
            int outer = 0;
            int middle = 0;
            int variableX = 0;
            int variableY = 0;


            //Print the array in nested parenthetical format
            System.out.print("{");
            for ( outer = 0; outer < 3; outer++ ) {
                if (outer>=1) {
                    System.out.print(", ");
                }
                System.out.print("{");
                for ( middle = 0; middle < array[outer].length; middle++ ) {
                    if ( middle>=1 ) {
                                System.out.print(", ");
                    }
                    System.out.print("{");
                    for ( variableX = 0; variableX < array[outer][middle].length; variableX++ ) {
                        if ( variableX>=1 ) {
                                System.out.print(", ");
                        }
                        System.out.print("{");
                        for ( variableY = 0; variableY < array[outer][middle][variableX].length; variableY++ ) {
                            
                            if ( variableY>=1 ) {
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
        public static void main (String [ ] Args) { //start of main method
            
            int variableX = 0;  //declare variable for user input
            int variableY = 0;  //declare variable for user input
            
            //The for loop for checking input variableX
            for ( int i=2; i>1; i++) {
                System.out.print("Enter an integer X: ");   //prompt the user to enter an integer X
                Scanner scan = new Scanner (System.in); //construct scanner
            
                if ( scan.hasNextInt() ) {  //check whether the input is an integer
                    variableX = scan.nextInt(); //assign variable to the input
                    break;  //break the loop
                }
            
                else {  //if the input is not an integer
                    System.out.print("Invalid input. Please enter an integer X: "); //show the error and prompt the user to enter again
                    scan.next();    //clear the buffer
                    i--;    //continue the loop
                }
            }

            //The for loop for checking the input variableY
            for ( int j=2; j>1; j++) {  
                System.out.print("Enter an integer Y where Y > X: ");   //prompt the user to enter an integer Y
                Scanner scan = new Scanner (System.in); //construct scanner
            
                if ( scan.hasNextInt() ) {   //check whether the input is an integer
                    variableY = scan.nextInt();     //assign variable to the input
                
                    if ( variableY > variableX) {   //check whether variableY is greater than variableX
                        break;  //break the loop
                    }
                
                    else {  //if variableY is smaller than variableX
                        System.out.print("Invalid input. Please enter an integer for Y > X: "); //show the error message and prompt the user to enter again
                        scan.nextInt(); //clear the buffer
                        j--;    //continue the loop
                    }
                
                }
            
                else {  //if the input is not an integer
                    System.out.print("Invalid input. Please enter an integer for Y > X: "); //show the error and prompt the user to enter again
                    scan.next();    //clear the buffer
                    j--;    //continue the loop
                }
            }
        
            int outer = 3;  //make the outer loop of the areray number of 3
            int middle = (int)((Math.random()*(variableY-variableX+1)) + variableX);    //assign the seconf dimension of the array
        
            double [ ] [ ] [ ] [ ] array = new double [outer] [middle] [variableX] [variableY] ;  //declare variable for array
        
            //Create array
            for ( outer = 0; outer < 3; outer++ ) {
                for ( middle = 0; middle < array[outer].length; middle++ ) {
                    for ( variableX = 0; variableX < array[outer][middle].length; variableX++ ) {
                        for ( variableY = 0; variableY < array[outer][middle][variableX].length; variableY++ ) {
                            
                            double random = (double)((Math.random()*310));
                            int random2 = (int)(random*10);
                            double random3 = (double) (random2/10.0);
                            array[outer][middle][variableX][variableY] = random3;  //assign random doubles in the array
                        
                        }
                    }
                }
            }
            
            System.out.println(""); //leave a space line
            System.out.println("Original Array: "); //print the original array
            printArray( array );    //using the printArray method to print the array
            System.out.println(""); //leave a space line
            System.out.println("Sorted Array: ");   //print the sorted array
            printArray( sort4DArray(array) );   //using the printArray method to print the sorted array
            System.out.println(""); //leave a space line
            statArray( array ); //using statArray method to show the statistics of the array

        
        }   //end of the main method
        
    }   //end of the class