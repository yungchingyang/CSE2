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
//  define a class
        public class CC {
//  main method required for every Java program
        public static void main (String[ ] args) {
//
    Scanner myScanner;  //to accept input
    myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
//
//  Start by:
    System.out.print("Enter the number of People: ");   //prompt the user for the number of people
    if ( myScanner.hasNextInt()) {
        int nPeople = myScanner.nextInt();  //  accept user input of number of people
        
        if (nPeople > 0) {
            
        }
        System.out.print("Enter the number of cookies you are planning to buy: ");  //prompt the user for the number of cookies
        if ( (myScanner.hasNextInt()) ) {
            int nCookies = myScanner.nextInt();
            
            System.out.print("How many do you want each person to get? ");  //prompt the user for the desired number of cookies each person get
            if ( (myScanner.hasNextInt()) ) {
                int nEach = myScanner.nextInt();
                
                if ( (nEach >= 0) && ((nCookies / nPeople) >= nEach) ) {
                    System.out.println("You have enough cookies for each person and the amount will divide evenly.");   //message for success
                }
                
                else if ( ((nCookies / nPeople) >= nEach) && ((nCookies % nPeople) < nEach) ) {
                    System.out.println("You have enough, but they will not divide evenly.");   //print if there are enough cookies but cannot be divided evenly
                    return;
                }
                
                else if ( ((nCookies / nPeople) < nEach) ){
                    System.out.println("You will not have enough cookies. You need to buy at least " + ((nPeople * nEach) - nCookies) + " more."); //show the advice to increase cookies
                    return;
                }
                
            }
            
            else if ( myScanner.nextInt() <= 0 ) {
                System.out.println("You did not enter an integer > 0. ");
                return;
            }
            
            else {
                System.out.println("You did not enter an int"); //print the error message if nEach is not an integer
                return;    //leaves the program, i.e. the program terminates
            }
            
            
        }
        
        else if ( myScanner.nextInt() <= 0 ){
            System.out.println("You did not enter an integer > 0. ");
            return;
        }
        
        else {
            System.out.println("You did not enter an integer. ");
            return; 
        }
        
    }
    
    else if ( (myScanner.hasNextInt()) && (myScanner.nextInt() <= 0) ) {
        System.out.println("You did not enter an integer > 0. ");
        return;
    }
    
    
    else {
        System.out.println("You did not enter an integer. ");
        return;
    }
//
    }   //end of main method
}   //end of the main class
    