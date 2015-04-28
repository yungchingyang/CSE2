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

            
            //Create array 1
            System.out.println("The first array is:");
            for ( int a = 0; a<array1.length; a++ ) {
                array1[a] = rnd.nextInt(101);
                System.out.println(array1[a]);
            }
            
            
            //Finding maximum for array 1
            int max1 = array1[0];
            for ( int b=1; b<array1.length; b++) {
                if (array1[b] > max1) {
                    max1 = array1[b];
                }
            }
            
            
            //Finding minimum for array 1
            int min1 = array1[0];
            for ( int c = 1; c<array1.length; c++) {
                if (min1 > array1[c]) {
                    min1 = array1[c];
                }
            }
            
            System.out.println("");
            
            
            //Create array 2
            System.out.println("The second array is:");
            for ( int d = 0; d<array2.length; d++ ) {
                array2[d] = rnd.nextInt(101);
                if (d>=1) {
                    array2[d] = rnd.nextInt(101) + array2[d-1];
                }
                System.out.println(array2[d]);
            }
            
            
             //Finding maximum for array 2
            int max2 = array2[0];
            for ( int e=1; e<array2.length; e++) {
                if (array2[e] > max2) {
                    max2 = array2[e];
                }
            }
            
            
            //Finding minimum for array 2
            int min2 = array2[0];
            for ( int f = 1; f<array1.length; f++) {
                if (min2 > array2[f]) {
                    min2 = array2[f];
                }
            }

            
            System.out.println("The maximum of array1 is: " + max1);
            System.out.println("The minimum of array1 is: " + min1);
            System.out.println("The maximum of array2 is: " + max2);
            System.out.println("The minimum of array2 is: " + min2);
            
            
            for ( int i=2; i>1; i++) {
            
                System.out.print("Enter an int: ");
                scan = new Scanner(System.in);
                
                if ( scan.hasNextInt() ) {
                    int key = scan.nextInt();
                    
                    if ( key>=0) {
                        
                        int low = 0;
                        int high = array2.length-1;
                        int mid=0;
                        
                        while (high >=low ) {
                            mid = (low + high) / 2;
                            
                            if (key < array2[mid]) {
                                high = mid - 1;
                            }
                            
                            else if ( key==array2[mid]) {
                                System.out.println(key + " was found in the list.");
                                i=0;
                                break;
                            }
                            
                            else {
                                low = mid + 1;
                            }
                            
                        }
                        
                        if ( key!=array2[mid]) {
                        System.out.println(key + " was not found in the list.");
                        System.out.println("The number below the key was " + array2[mid]);
                        System.out.println("The number above the key was " + array2[mid-1]);
                        i=0;
                        break;
                        }
                        
                        
                    }
                    
                    else {
                        System.out.println("You did not enter an int > 0");
                        break;
                    }
                    
                }
                
                else {
                    System.out.println("You did not enter an int");
                    break;
                }
            
            }
            

            
        }   //end of main method
    }   //end of the class