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
        public class Cookies {
//  main method required for every Java program
        public static void main (String[ ] args) {
//
    Scanner myScanner;  //to accept input
    myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
//
//  Start by:
    System.out.print("Enter the number of People: ");   //prompt the user for the number of people
    int nPeople = myScanner.nextInt();  //  accept user input of number of people
//
//  Conditions and operations
    if ( (myScanner.hasNextInt()) && (nPeople>0) ) {  //check whether the user inputs an int for number of people
//
        System.out.print("Enter the number of cookies you are planning to buy: ");  //prompt the user for the number of cookies
        int nCookies = myScanner.nextInt(); //accept user input of number of cookies
//
        if ( (myScanner.hasNextInt()) && (nCookies>0) ) { //check whether the user inputs a positive int for number of cookies
//
            System.out.print("How many do you want each person to get? ");  //prompt the user for the desired number of cookies each person get
            int nEach = myScanner.nextInt();    //accept user input of number of desired number of cookies each person get
//            
            if ( (myScanner.hasNextInt()) && (nEach>0) && ((nCookies / nPeople) >= nEach) ) {  //check whether the user inputs a bigger int for the sesired number of cookies each person get
                System.out.println("You have enough cookies for each person and the amount will divide evenly.");   //message for success
            }
//          
            else if ( (myScanner.hasNextInt()) && (nEach <= 0) ) {    //if nEach is an integer and smaller or equal to 0
                System.out.println("You did not enter an int > 0"); //print the error message if input is not bigger than zero
                return;    //leaves the program, i.e. the program terminates
                }
//            
            else if ( (myScanner.hasNextInt()) && ((nCookies / nPeople) >= nEach) && ((nCookies % nPeople) < nEach) ) {  //check if nEach is bigger than zero and cad be divided evenly.
                System.out.println("You have enough, but they will not divide evenly.");   //print if there are enough cookies but cannot be divided evenly
                return;
                }
//
            else if ( (myScanner.hasNextInt()) && ((nCookies / nPeople) < nEach) ) {  //check whether nEach is an integer and the cookies can be divided to people evenly or not
                System.out.println("You will not have enough cookies. You need to buy at least " + ((nPeople * nEach) - nCookies) + " more."); //show the advice to increase cookies
                return;
                }
//            
            else {
                System.out.println("You did not enter an int"); //print the error message if nEach is not an integer
                return;    //leaves the program, i.e. the program terminates
                }
        }
//
        else if ( (myScanner.hasNextInt()) && (nCookies <= 0) ) {  //check nCookies is an integer greater than zero
            System.out.println("You did not enter an int > 0"); //print the error message if the integer is less than zero
            return;    //leaves the program, i.e. the program terminates
            }
//       
        else {
            System.out.println("You did not enter an int"); //print the error message if nCookies is not an integer
            return;    //leaves the program, i.e. the program terminates
            }
    }
//
    else if ( (myScanner.hasNextInt()) && (nPeople <= 0) ) {  //check if nPeople is an integer greater than zero
        System.out.println("You did not enter an int > 0"); //print the error message if input is an integer less than zero
        return; //leaves the program, i.e. the program terminates
        }
//
    else {
        System.out.println("You did not enter an int"); //print the error message if nPeople is not an integer
        return;    //leaves the program, i.e. the program terminates
        }
//
   }    //end of main method
}  //end of class