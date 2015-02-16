//////////////////////////////
//Yung Ching Yang
//February 13 2015
//Which Number Java Program
//It is a program that prompts the user to think of an int between 1 and 10 inclusive. 
//Then the program proceeds to ask the user questions in an attempt to guess what number the user is thinking of.
// 
//  first compile the program
//      javac WhichNumber.java
//  run the program
//      java WhichNumber//
//
    import java.util.Scanner;   //import scanner
//    
//  define a class
        public class WhichNumber {
//  main method required for every Java program
        public static void main (String[ ] args) {
//
    Scanner myScanner;  //to accept input
    myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
//
    System.out.println("Think of a number between 1 and 10 inclusive. ");   //prompt the user to think of a number between 1 and 10 inclusive
    System.out.print("Is the number even? ");   //prompt the user to answer if the number is even
    String nEven = myScanner.nextLine();    //accept user input for even answer
//  
    if ( nEven.equalsIgnoreCase("y") ){ //check whether nEven is even
        
        System.out.print("Is it divisible by 3? "); //prompt the user to answer if the number is divisible by 3
        String nDivisible3Left = myScanner.nextLine();  //accept user input for divisible by 3
//        
        if ( nDivisible3Left.equalsIgnoreCase("y") ) { //check whether nDivisible3Left is divisible by 3
//            
            System.out.print("Is your number 6? "); //prompt the user to answer if the number is 6
            String nSix = myScanner.nextLine();   //accept user input of anser if it is 6
//            
            if ( nSix.equalsIgnoreCase("y") ) {    //check whether the number is 6
//                
                System.out.println("Yay! ");    //show the expression when the guessing is correct
                return; //quit the program
//            
            }
//            
            else if ( nSix.equalsIgnoreCase("n") ) {   //check whether the number is 6
//                
                System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                return; //quit the program
//          
            }
//          
            else {  //check if there is an invalid input
//              
                System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                return; //quit the program
//              
            }
//          
        }
//        
        else if ( nDivisible3Left.equalsIgnoreCase("n") ) {    //check whether nDivisible3Left is divisible by 3
//          
            System.out.print("Is the number divisible by 4? "); //prompt the user to answer whether the answer is divisible by 4
            String nDivisible4Left = myScanner.nextLine();    //accept user input of the answer whether the number is divisible by 4
//          
            if ( nDivisible4Left.equalsIgnoreCase("y") ) { //check whether the number is divisible by 4 
//              
                System.out.print("Is the number divided by 4 greater than 1? ");    //prompt the use if the number divided by 4 is greater than 1
                String nGreater1Left = myScanner.nextLine();  //accept user input of the answer if the number divided by 4 is greater than 1
//              
                if ( nGreater1Left.equalsIgnoreCase("y") ){
//                  
                    System.out.print("Is your number 8? "); //prompt the user to answer if the number is 8
                    String nEight = myScanner.nextLine();   //accept user input of anser if it is 8
//          
                    if ( nEight.equalsIgnoreCase("y") ) {    //check whether the number is 8
//                  
                        System.out.println("Yay! ");    //show the expression when the guessing is correct
                        return; //quit the program;
//                      
                    }
//            
                    else if ( nEight.equalsIgnoreCase("n") ) {   //check whether the number is 8
//              
                        System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                        return; //quit the program
//                      
                    }
//                  
                    else {  //check if there is an invalid input
//              
                        System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                        return; //quit the program
//
                    }
//                  
                }
//              
                else if ( nGreater1Left.equalsIgnoreCase("n") ) {  //check whether the number is greater than 1
//                  
                    System.out.print("Is your number 4? "); //prompt the user to answer if the number is 4
                    String nFour = myScanner.nextLine();   //accept user input of anser if it is 4
//          
                    if ( nFour.equalsIgnoreCase("y") ) {    //check whether the number is 4
//                  
                        System.out.println("Yay! ");    //show the expression when the guessing is correct
                        return; //quit the program
//                      
                    }
//            
                    else if ( nFour.equalsIgnoreCase("n") ) {   //check whether the number is 4
//                      
                        System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                        return; //quit the program
//                      
                    }
//                  
                    else {  //check if there is an invalid input
//              
                        System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                        return; //quit the program
//              
                    }
//                  
                }
//              
                else {  //check if there is an invalid input
//              
                    System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                    return; //quit the program
//              
                }
//              
            } 
//          
            else if ( nDivisible4Left.equalsIgnoreCase("n") ) {    //check whether the number is divisible by 4
//              
                System.out.print("Is it divisible by 5? "); //prompt the user to answer whether the number is divisible by 5
                String nDivisible5 = myScanner.nextLine();  //accept user input of the answer whether the number is divisible by 5
//              
                if ( nDivisible5.equalsIgnoreCase("y") ) { //check whether the number is divisible by 5
//                  
                    System.out.print("Is your number 10? "); //prompt the user to answer if the number is 10
                    String nTen = myScanner.nextLine();   //accept user input of anser if it is 10
          
                    if ( nTen.equalsIgnoreCase("y") ) {    //check whether the number is 10
//
                        System.out.println("Yay! ");    //show the expression when the guessing is correct
                        return; //quit the program
//                      
                    }
//            
                    else if ( nTen.equalsIgnoreCase("n") ) {   //check whether the number is 10
//                      
                        System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                        return; //quit the program
//                      
                    }
//                  
                    else {  //check if there is an invalid input
//              
                        System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                        return; //quit the program
//              
                    }
//                  
                }
//              
                else if ( nDivisible5.equalsIgnoreCase("n") ) {    //check whether the number is divisible by 5
//                 
                    System.out.print("Is your number 2? "); //prompt the user to answer if the number is 2
                    String nTwo = myScanner.nextLine();   //accept user input of anser if it is 2
//          
                    if ( nTwo.equalsIgnoreCase("y") ) {    //check whether the number is 2
//                   
                        System.out.println("Yay! ");    //show the expression when the guessing is correct
                        return; //quit the program
//                      
                    }
//            
                    else if ( nTwo.equalsIgnoreCase("n") ) {   //check whether the number is 2
//                     
                        System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                        return; //quit the program
//                      
                    }
//                  
                    else {  //check if there is an invalid input
//              
                        System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                        return; //quit the program
//              
                    }
//                  
                }
//              
                else {  //check if there is an invalid input
//              
                    System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                    return; //quit the program
//              
                }
//              
            }
//          
            else {  //check if there is an invalid input
//              
                System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                return; //quit the program
//              
            }
//          
        }
//      
        else {  //check if there is an invalid input
//              
                System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                return; //quit the program
//              
            }
//      
    }    
//
    else if ( nEven.equalsIgnoreCase("n") ) {  //check whether the number is an even number
//        
        System.out.print("Is it divisible by 3? "); //prompt the user to answer if the number is divisible by 3
        String nDivisible3Right = myScanner.nextLine(); //accept user input for divisible by 3
//      
        if ( nDivisible3Right.equalsIgnoreCase("y") ) { //check whether nDivisible3Right is divisible by 3
//        
            System.out.print("When divided by 3 is the result greater than 1? ");   //prompt the user to answer if the number divided by 3 is the result greater than 1
            String nGreater1Right = myScanner.nextLine(); //accept user input of the answer whether the number when divided by 3 is it greater than 1
//      
            if ( nGreater1Right.equalsIgnoreCase("y") ) {  //check whether the number is greater than 1 after divided by 3
//              
                System.out.print("Is your number 9? "); //prompt the user to answer if the number is 9
                String nNine = myScanner.nextLine();   //accept user input of anser if it is 9
//          
                if ( nNine.equalsIgnoreCase("y") ) {    //check whether the number is 9
//              
                    System.out.println("Yay! ");    //show the expression when the guessing is correct
                    return; //quit the program
//                
                }
//            
                else if ( nNine.equalsIgnoreCase("n") ) {   //check whether the number is 9
//              
                    System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                    return; //quit the program
//                  
                }
//              
                else {  //check if there is an invalid input
//              
                    System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                    return; //quit the program
//              
                }
//              
            }
//          
            else if ( nGreater1Right.equalsIgnoreCase("n") ) { //check whether the number is greater than 1 after divided by 3
//          
                System.out.print("Is your number 3? "); //prompt the user to answer if the number is 3
                String nThree = myScanner.nextLine();   //accept user input of anser if it is 3
//          
                if ( nThree.equalsIgnoreCase("y") ) {    //check whether the number is 3
//              
                    System.out.println("Yay! ");    //show the expression when the guessing is correct
                    return; //quit the program
//
                }
//            
                else if ( nThree.equalsIgnoreCase("n") ) {   //check whether the number is 3
//              
                    System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                    return; //quit the program
//
                }
//              
                else {  //check if there is an invalid input
//              
                    System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                    return; //quit the program
//              
                }
//              
            }
//          
            else {  //check if there is an invalid input
//              
                System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                return; //quit the program
//              
            }
//          
        }
//
        else if ( nDivisible3Right.equalsIgnoreCase("n") ) {    //check whether nDivisible3Right is divisible by 3
//        
            System.out.print("Is it greater than 6? ");    //prompt the user to answer whether the number is greater than 6
            String nGreater6 = myScanner.nextLine();  //accept user input of the answer whether the number is greater than 6
//      
            if( nGreater6.equalsIgnoreCase("y") ) {    //check whether the number is greater than 6
//          
                System.out.print("Is your number 7? "); //prompt the user to answer if the number is 7
                String nSeven = myScanner.nextLine();   //accept user input of anser if it is 7
//          
                    if ( nSeven.equalsIgnoreCase("y") ) {    //check whether the number is 7
//              
                        System.out.println("Yay! ");    //show the expression when the guessing is correct
                        return; //quit the program
//                      
                    }
//            
                    else if ( nSeven.equalsIgnoreCase("n") ) {   //check whether the number is 7
//              
                        System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                        return; //quit the program
//                      
                    }
//                  
                    else {  //check if there is an invalid input
//              
                        System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                        return; //quit the program
//              
                    }
//          
            }
//          
            else if ( nGreater6.equalsIgnoreCase("n") ) {  //check whether the number is greater than 6
//              
                System.out.print("Is it less than 3? ");    //prompt the user to answer whether the number is less than 3
                String nLess3 = myScanner.nextLine(); //accept user input of the answer whether the number is less than 3
//              
                if ( nLess3.equalsIgnoreCase("y") ) {  //check whether the number is less than 3
//                  
                    System.out.print("Is your number 1? "); //prompt the user to answer if the number is 1
                    String nOne = myScanner.nextLine();   //accept user input of anser if it is 1
//          
                    if ( nOne.equalsIgnoreCase("y") ) {    //check whether the number is 1
//                      
                        System.out.println("Yay! ");    //show the expression when the guessing is correct
                        return; //quit the program
//                      
                    }
//            
                    else if ( nOne.equalsIgnoreCase("n") ) {   //check whether the number is 1
//                      
                        System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                        return; //quit the program
//                      
                    }
//                  
                    else {  //check if there is an invalid input
//              
                        System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                        return; //quit the program
//              
                    }
//                  
                }
//              
                else if ( nLess3.equalsIgnoreCase("n") ) { //check whether the number is less than 3
//                  
                    System.out.print("Is your number 5? "); //prompt the user to answer if the number is 5
                    String nFive = myScanner.nextLine();   //accept user input of anser if it is 5
//          
                    if ( nFive.equalsIgnoreCase("y") ) {    //check whether the number is 5
//                      
                        System.out.println("Yay! ");    //show the expression when the guessing is correct
                        return; //quit the progam
//                      
                    }
//            
                    else if ( nFive.equalsIgnoreCase("n") ) {   //check whether the number is 5
//                      
                        System.out.println("Noooooo! ");    //show the expression if the guess is wrong
                        return; //quit the program
//                      
                    }
//                  
                    else {  //check if there is an invalid input
//              
                        System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                        return; //quit the program
//              
                    }
//                  
                }
//              
                else {  //check if there is an invalid input
//              
                    System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                    return; //quit the program
//              
                }
//              
            }
//          
            else {  //check if there is an invalid input
//              
                System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                return; //quit the program
//              
            }
//          
        }
//      
        else {  //check if there is an invalid input
//              
                System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
                return; //quit the program
//              
        }
//
    }
//  
    else {  //check if there is an invalid input
//      
        System.out.println("Sorry, that is not a valid input. ");   //print the warning for invalid input
        return; //quit the program
//      
    }
//
    }   //end of the main method
}   //end of the class