//////////////////////////////
//Yung Ching Yang
//February 13 2015
//Banking Java Program
//It is a program that allows users to process banking transactions.
// 
//  first compile the program
//      javac Banking.java
//  run the program
//      java Banking//
//
    import java.util.Scanner;   //import scanner
    import java.util.Random;   //import random function
//    
//  define a class
        public class BB {
//  main method required for every Java program
        public static void main (String[ ] args) {
//
    Scanner myScanner;  //to accept input
    myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
//
    Random rand = new Random();  //provide random number generator
    int randomNumber = rand.nextInt(400001) + 100000;   //set the range of the random number
    double randomAccount = randomNumber / 100.00;  //make the random number in the form of xxxx.xx
//    
    System.out.println("If you want to deposit money, type 'A'. "); //print the explanation of option A
    System.out.println("If you want to withdraw money, type 'B'. ");    //print the explanation of option B
    System.out.println("If you want to view your balance, type 'C'. "); //print the explanation of option C
    System.out.print("Type your choice: "); //prompt the user to choose the option
    String customerChoice = myScanner.nextLine();   //accept user input of option
    
//   
    if ( customerChoice.equalsIgnoreCase("A") ) {    //enter the condition if user chooses to deposit money
//
        System.out.print("How much do you want to deposit (Please enter a positive number with 2 decimal places)?  $"); //prompt the user to state the desired number to deposit
        if ( (myScanner.hasNextDouble()) ) {//accept user input of deposit)(nDeposit >= 0) ) {  //enter the condition if the deposit input is positive
            double nDeposit = myScanner.nextDouble(); //accept user input of deposit
            
//      
            if ( (myScanner.nextDouble() >= 0)) {
        
                System.out.println("Your resulting balance is $" + randomAccount + " + $" + nDeposit + " = $" + (randomAccount + nDeposit)); //show the account balance
                return; //quit the program
            
            }
            
            else if ( (myScanner.nextDouble() < 0) ) {
                
                System.out.println("Please enter a positive number with 2 decimal places. Try over again. "); //show advice
                return; //quit the program
                
            }
//          
        }
//      
        else {  //enter the condition if the deposit input is invalid
//          
            System.out.println("Invalid input. Try again. ");   //show the error message
            return;  //quit the program
//          
        }
//      
    }
//  
    else if ( customerChoice.equalsIgnoreCase("B") ) {  //enter the condition if the user chooses to withdraw money
//      
        System.out.print("How much do you want to withdraw (Please enter a positive number with 2 decimal places) ?  $");   //prompt the user to state the desired number to withdraw
//      
        if ( (myScanner.hasNextDouble()) ) {//accept user input of withdraw
//  
            double nWithdraw= myScanner.nextDouble(); //accept user input of withdraw
            
            if ( (myScanner.nextDouble() >= 0) ) {
        
                System.out.println("Your resulting balance is $" + randomAccount + " - $" + nWithdraw + " = $" + (randomAccount - nWithdraw)); //show the account balance
                return; //quit the program
            
            }
            
            else if ( (myScanner.nextDouble() < 0) ) {
                
                System.out.println("Please enter a positive number with 2 decimal places. Try over again. "); //show advice
                return; //quit the program
                
            }
//          
        }
//      
        else {  //enter the condition if the deposit input is invalid
//          
            System.out.println("Invalid input. Try again. ");   //show the error message
            return;  //quit the program
//          
        }
//      
    }
//
    else if ( customerChoice.equalsIgnoreCase("C") ) {  //enter the condition if the user chooses to view balance
//      
        System.out.println("Your resulting balance is $" + randomAccount ); //show the account balance
        return; //quit the program
//      
    }
//  
    else {  //enter the condition out of the three options (invalid input)
//      
        System.out.println("Invalid input. Try again. ");   //show the error message
        return; //quit the program
//      
    }
//  
    }   //end of the main method
}   //end of the class