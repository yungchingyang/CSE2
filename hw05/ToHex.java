//////////////////////////////
//Yung Ching Yang
//February 23 2015
//To Hex Java Program
//It is a program that takes decimal RGB values (three inputs) and convert them to hexadecimal.
//
//  first compile the program
//      javac ToHex.java
//  run the program
//      java ToHex//
//    
    import java.util.Scanner;   //import scanner
    
    public class ToHex{ //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
        
            Scanner myScanner;  //to accept input
            myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
        
            System.out.print("Please enter three numbers representing RGB values: ");   //prompt the user to enter inputs
            int threeNumbersOne;    //define the first input
            int threeNumbersTwo;    //define the second input
            int threeNumbersThree;  //define the third input
            
            String aOne = "aOne";   //define the first digit of hexadecimal set
            String aTwo = "aTwo";   //define the second digit of hexadecimal set
            String bOne = "bOne";   //define the third digit of hexadecimal set
            String bTwo = "bTwo";   //define the fourth digit of hexadecimal set
            String cOne = "cOne";   //define the fifth digit of hexadecimal set
            String cTwo = "cTwo";   //define the sixth digit of hexadecimal set
        
            if ( (myScanner.hasNextInt()) & (myScanner.hasNextInt()) & (myScanner.hasNextInt()) ){  //check whether the inputs are integers
                threeNumbersOne = myScanner.nextInt();  //assign first input
                threeNumbersTwo = myScanner.nextInt();  //assign second input
                threeNumbersThree = myScanner.nextInt();    //assign third input;
            
                if ( (threeNumbersOne >= 0) & (threeNumbersTwo >=0) & (threeNumbersThree >= 0) ) {  //check whether if the inputs are bigger than or equal to 0
                    
                    if ( (threeNumbersOne <= 255) & (threeNumbersTwo <= 255) & (threeNumbersThree <= 255) ) {   //check whether if the inputs are smaller than or equal to 255
                    
                        // calculate and assign the first digit to hexadecimal
                        switch ( threeNumbersOne/16 ) {
                            case 10: aOne = "A"; break;
                            case 11: aOne = "B"; break;
                            case 12: aOne = "C"; break;
                            case 13: aOne = "D"; break;
                            case 14: aOne = "E"; break;
                            case 15: aOne = "F"; break;
                            default: aOne = "" + threeNumbersOne/16; break;
                        }
                    
                        // calculate and assign the second digit to hexadecimal
                        switch ( threeNumbersOne%16 ) {
                            case 10: aTwo = "A"; break;
                            case 11: aTwo = "B"; break;
                            case 12: aTwo = "C"; break;
                            case 13: aTwo = "D"; break;
                            case 14: aTwo = "E"; break;
                            case 15: aTwo = "F"; break;
                            default: aTwo = "" + threeNumbersOne%16; break;
                        }
                    
                        // calculate and assign the third digit to hexadecimal
                        switch ( threeNumbersTwo/16 ) {
                            case 10: bOne = "A"; break;
                            case 11: bOne = "B"; break;
                            case 12: bOne = "C"; break;
                            case 13: bOne = "D"; break;
                            case 14: bOne = "E"; break;
                            case 15: bOne = "F"; break;
                            default: bOne = "" + threeNumbersTwo/16; break;
                        }
                    
                        // calculate and assign the fourth digit to hexadecimal
                        switch ( threeNumbersTwo%16 ) {
                            case 10: bTwo = "A"; break;
                            case 11: bTwo = "B"; break;
                            case 12: bTwo = "C"; break;
                            case 13: bTwo = "D"; break;
                            case 14: bTwo = "E"; break;
                            case 15: bTwo = "F"; break;
                            default: bTwo = "" + threeNumbersTwo%16; break;
                        }
                        
                        // calculate and assign the fifth digit to hexadecimal
                        switch ( threeNumbersThree/16 ) {
                            case 10: cOne = "A"; break;
                            case 11: cOne = "B"; break;
                            case 12: cOne = "C"; break;
                            case 13: cOne = "D"; break;
                            case 14: cOne = "E"; break;
                            case 15: cOne = "F"; break;
                            default: cOne = "" + threeNumbersThree/16 ; break;
                        }    
                    
                        // calculate and assign the sixth digit to hexadecimal
                        switch ( threeNumbersThree%16 ) {
                            case 10: cTwo = "A"; break;
                            case 11: cTwo = "B"; break;
                            case 12: cTwo = "C"; break;
                            case 13: cTwo = "D"; break;
                            case 14: cTwo = "E"; break;
                            case 15: cTwo = "F"; break;
                            default: cTwo = "" + threeNumbersThree%16; break;
                        }

                        System.out.println("The decimal numbers R:" + threeNumbersOne + ", G:" + threeNumbersTwo + ", B:"+ threeNumbersThree + ", is represented in hexadecimal as: " + aOne + aTwo + bOne + bTwo + cOne + cTwo + ". ");    //print the inputs in decimal and the result in hexadecimal
                        return; //exit the program
                    }
                        
                    else {
                        System.out.println("Sorry, you must enter an values between 0-255. ");  //print the error message if the inputs are bigger than 256
                        return; //exit the program
                    }
    
                }
        
                else {
                    System.out.println("Sorry, you must enter an values between 0-255. ");  //print the error message if the inputs are smaller than 0
                    return; //exit the program
                }
            
            }
        
            else {  
                System.out.println("Sorry, your input must consist of integers. "); //print the error message if the inputs are not integer
                return; //exit the program
            }
        
        
            
        }   //end of main method
    }   //end of the class