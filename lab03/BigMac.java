///////////////////////////////////////////////
//Yung Ching Yang
//February 6 2015
//BigMac Program
//The program computes the cost of buying some Big Macs.
//
//  first compile the program
//      javac BigMac.java
//  run the program
//      java BigMac//
//
    import java.util.Scanner;   //import scanner
//
//  define a class
        public class BigMac {
//  main method required for every Java program
        public static void main (String [ ] args) {
//
    Scanner myScanner;  //to accept input
    myScanner = new Scanner( System.in ) ;  //construct an instance of the Scanner class
//
//  Prompt the user for the number of tickets
    System.out.print("Enter the number of Big Macs (an integer > 0): ");
//
//  Accept user input
    int nBigMacs = myScanner.nextInt(); //calls a method that Scanner objects have – the “nextInt()” method
//
//  Prompt the user for the cost Big Mac and the percent sales tax and accept the input.
    System.out.print("Enter the cost per Big Mac as" + " a double (in the form xx.xx): ");
    double bigMac$ = myScanner.nextDouble();    //assign bigMac$
	System.out.print("Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble();    //assign tax rate
    taxRate/=100; //user enters percent, but I want proportion
//
//  Print out the output of the cost of the Big Macs
    double cost$;
    int dollars,   //whole dollar amount of cost 
        dimes, pennies; //for storing digits
                         //to the right of the decimal point 
                        //for the cost$ 
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    //get the whole amount, dropping decimal fraction
    dollars=(int)cost$;
    //get dimes amount, e.g., 
    // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
    //  where the % (mod) operator returns the remainder
    //  after the division:   583%100 -> 83, 27%5 -> 2 
    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;
    System.out.println("The total cost of " + nBigMacs + " BigMacs, at $" + bigMac$ + " per bigMac, with a" 
    + " sales tax of " + (int)(taxRate*100) + "%, is $" + dollars + "." + dimes + pennies);
     
    }
}