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

    public class ArrayInputs {  //define a class
        
        public static void main (String [ ] Args) {

            
                System.out.print("Please enter an integer for the size of an array: ");
                Scanner scan = new Scanner (System.in); //construct scanner
                int size;
                int number;
                int a=0;
            
                for ( int i=1; i>=1; i++) {
                    if ( scan.hasNextInt() ) {
                        size = scan.nextInt();
                    
                        if ( size > 0 ) {
                                
                            System.out.print("Please enter " + size + " positive integer:");
                        
                            if ( scan.hasNextInt() ) {
                                
                                int [ ] myList = new int[size];
                            
                                for ( a=0; a<myList.length; a++) {  //fill the array with numbers
                                    myList[a] = scan.nextInt();
                                }
                                
                                System.out.println("The array is:" );
                                
                                for ( int b=0; b<myList.length; b++) {  //fill the array with numbers
                                    System.out.println(myList[b]);
                                }
          
                                i = 0;
                                break;
                            
                            }
                        
                            else {
                                System.out.println("Sorry, you didn't enter an integer.");
                                scan.next();
                                System.out.print("Please enter a positive integer: ");
                                i++;
                            }
  
                        }
                    
                        else {
                            System.out.println("Sorry, the number you entered is negative.");
                            i++;
                    
                        }
                    
                    }
            
                    else {
                        System.out.println("Sorry, you didn’t enter an integer.");
                        scan.next();
                        System.out.print("Please enter a positive integer: ");
                        i++;
                    }
                }
            
            
            
        }
    
    
    }