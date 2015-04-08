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
            
            for ( int i=1; i>=1; i++) {
                if ( scan.hasNextInt() ) {
                    size = scan.nextInt();
                    
                    if ( size > 0 ) {
                    
                        System.out.print("Please enter a positive integer: ");
                        
                        if ( scan.hasNextInt() ) {
                            number = scan.nextInt();
                            
                            if ( number > 0 ) {
                                
                                System.out.print("Please enter " + size + " positive integer:");
                                
                                
                                int [ ] myList = new int[size];
                                
                                System.out.println("The array is:" );
                                
                                for ( int a=0; a<myList.length; a++) {
                                    System.out.print(myList[a] + " ");
                                }
                                
                                System.out.println("");
          
                                break;
                                
                            }
                            
                            else {
                                System.out.println("Sorry, the number you entered is negative.");
                                i++;
                            }
                            
                        }
                        
                        else {
                            System.out.println("Sorry, you didn’t enter an integer.");
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
                    i++;
                }
            }
            
            
        }
    
    
    }