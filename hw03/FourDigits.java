//////////////////////////////
//Yung Ching Yang
//February 6 2015
//Four Digits Java Program
//It is a program thatprompts the user to enter a double and  then prints out the first four digits to 
//the right of the decimal point.
// 
//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits//
//
    import java.util.Scanner;   //import scanner
//    
//  define a class
        public class FourDigits {
//  main method required for every Java program
        public static void main (String[ ] args) {
//
    Scanner myScanner;  //to accept input
    myScanner = new Scanner( System.in ) ;  //construct an instance of the Scanner class
//
//  User input
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");  //Prompt the user for the a double
        double valueDouble = myScanner.nextDouble(); //Accept user input of a double value
//
//  Processing information
        int nMultiple = (int) (valueDouble * 10000);    //change the double into an integer while multiply bu 10000
        int aDigit = (nMultiple % 10000);   //get rid of the ten thousandth place
        int firstDigit = (aDigit / 1000);   //get the first digit
        int bDigit = (nMultiple % 1000);    //get rid of the thousandth place
        int secondDigit = (bDigit / 100);   //get the second diget
        int cDigit = (nMultiple % 100); //get rid of the hundredth place
        int thirdDigit = (cDigit / 10); //get the third digit
        int dDigit = (nMultiple % 10);  //get rid of the tenth place
        int fourthDigit = (dDigit / 1); //get the fourth digit
//
//  Print out the output of last four digits
        System.out.println("The four digits are " + firstDigit + secondDigit + thirdDigit + fourthDigit);
//
    }   //End of the main method
}  //End of the class