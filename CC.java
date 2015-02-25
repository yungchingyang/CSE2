//////////////////////////////
//Yung Ching Yang
//February 13 2015
//Cookies Java Program
//It is a program that uses the Scanner class to obtain from users how many cookies they want, how many 
//people they are buying for, and at least how many cookies they want each person to get.
// 
//  first compile the program
//      javac Cookies.java
//  run the program
//      java Cookies//
//
    import java.util.Scanner;   //import scanner
//    
    public class CC {   //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
//
        Scanner myScanner;  //to accept input
        myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
    
        System.out.print("Enter the Number of people: ");
        int nPeople;
    
        if ( myScanner.hasNextInt() ) {
            nPeople = myScanner.nextInt();
            
            if ( nPeople > 0 ) {
                System.out.print("Enter the number of cookies you are planning to buy: ");
                int nCookies;
                
                if ( myScanner.hasNextInt() ) {
                    nCookies = myScanner.nextInt();
                    
                    if ( nCookies > 0 ) {
                        System.out.print("How many do you want each person to get? ");
                        int nEach;
                        
                        if ( myScanner.hasNextInt() ) {
                            nEach = myScanner.nextInt();
                            
                            if ( nEach >= 0 ) {
                                
                                if ( ((nCookies / nPeople) >= nEach) ) {
                                    
                                    if ( (nCookies % nPeople) < nEach ) {
                                        System.out.println("You have enough cookies for each person and the amount will divide evenly.");
                                        return;
                                    }
                                    
                                    else {
                                        System.out.println("You have enough, but they will not divide evenly");
                                        return;
                                    }
                                }
                                
                                else {
                                    System.out.println("You will not have enough cookies. You need to bu at least " + ((nPeople * nEach) - nCookies) +" more. ");
                                    return;
                                }
                        
                            }
                            
                            else {
                                System.out.println("You did not enter an int > 0. ");
                                return;
                            }
                            
                        }
                        
                        else {
                            System.out.println("You did not enter an int");
                            return;
                        }
                        
                    }
                    
                    else{
                        System.out.println("You did not enter an int > 0");
                        return;
                    }
                    
                }
                
                else {
                    System.out.println("You did not enter an int.");
                    return;
                }
                
            }       
            
            else {
                System.out.println("You did not enter an int > 0");
                return;
            }
        
        }
    
        else {
            System.out.println("You did not enter an int");
            return;
        }
    
    }   //end of the main method
}   //end of the class