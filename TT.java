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
    
    public class TT{ //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
        
            Scanner myScanner;  //to accept input
            myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
        
            System.out.print("Please enter three numbers representing RGB values: ");
            int threeNumbersOne;
            int threeNumbersTwo;
            int threeNumbersThree;
            
            String aOne = "aOne";
            String aTwo = "aTwo";
            String bOne = "bOne";
            String 
        
            if ( myScanner.hasNextInt() & myScanner.hasNextInt() & myScanner.hasNextInt() ){
                threeNumbersOne = myScanner.nextInt();
                threeNumbersTwo = myScanner.nextInt();
                threeNumbersThree = myScanner.nextInt();
                
        
            
                if ( ((threeNumbersOne && threeNumbersTwo && threeNumbersThree) >=0) ) {
                    
                    if ( ((threeNumbersOne && threeNumbersTwo && threeNumbersThree) <= 255) ) {
                        
                        System.out.println("The decimal numbers R:" + threeNumbersOne + ", G:" + threeNumbersTwo + ", B:"+ threeNumbersThree + ", is represented in hexadecimal as: ");
                        
                        switch ( threeNumbersOne/16 ) {
                            case 10: aOne = "A"; break;
                            case 11: String aOne = "B"; break;
                            case 12: String aOne = "C"; break;
                            case 13: String aOne = "D"; break;
                            case 14: String aOne = "E"; break;
                            case 15: String aOne = "A"; break;
                            default: String aOne = threeNumbersOne/16 + " ";
                        }
                    
                        switch ( threeNumbersOne%16 ) {
                            case 0: System.out.println( "0"); break;
                            case 1: System.out.println( "1"); break;
                            case 2: System.out.println( "2"); break;
                            case 3: System.out.println( "3"); break;
                            case 4: System.out.println( "4"); break;
                            case 5: System.out.println( "5"); break;
                            case 6: System.out.println( "6"); break;
                            case 7: System.out.println( "7"); break;
                            case 8: System.out.println( "8"); break;
                            case 9: System.out.println( "9"); break;
                            case 10: System.out.println( "A"); break;
                            case 11: System.out.println( "B"); break;
                            case 12: System.out.println( "C"); break;
                            case 13: System.out.println( "D"); break;
                            case 14: System.out.println( "E"); break;
                            case 15: System.out.println( "F"); break;
                        }
                    
                        switch ( threeNumbersTwo/16 ) {
                            case 0: System.out.println( "0"); break;
                            case 1: System.out.println( "1"); break;
                            case 2: System.out.println( "2"); break;
                            case 3: System.out.println( "3"); break;
                            case 4: System.out.println( "4"); break;
                            case 5: System.out.println( "5"); break;
                            case 6: System.out.println( "6"); break;
                            case 7: System.out.println( "7"); break;
                            case 8: System.out.println( "8"); break;
                            case 9: System.out.println( "9"); break;
                            case 10: System.out.println( "A"); break;
                            case 11: System.out.println( "B"); break;
                            case 12: System.out.println( "C"); break;
                            case 13: System.out.println( "D"); break;
                            case 14: System.out.println( "E"); break;
                            case 15: System.out.println( "F"); break;
                        }
                    
                        switch ( threeNumbersTwo%16 ) {
                            case 0: System.out.println( "0"); break;
                            case 1: System.out.println( "1"); break;
                            case 2: System.out.println( "2"); break;
                            case 3: System.out.println( "3"); break;
                            case 4: System.out.println( "4"); break;
                            case 5: System.out.println( "5"); break;
                            case 6: System.out.println( "6"); break;
                            case 7: System.out.println( "7"); break;
                            case 8: System.out.println( "8"); break;
                            case 9: System.out.println( "9"); break;
                            case 10: System.out.println( "A"); break;
                            case 11: System.out.println( "B"); break;
                            case 12: System.out.println( "C"); break;
                            case 13: System.out.println( "D"); break;
                            case 14: System.out.println( "E"); break;
                            case 15: System.out.println( "F"); break;
                        }
                        
                        switch ( threeNumbersThree/16 ) {
                            case 0: System.out.println( "0"); break;
                            case 1: System.out.println( "1"); break;
                            case 2: System.out.println( "2"); break;
                            case 3: System.out.println( "3"); break;
                            case 4: System.out.println( "4"); break;
                            case 5: System.out.println( "5"); break;
                            case 6: System.out.println( "6"); break;
                            case 7: System.out.println( "7"); break;
                            case 8: System.out.println( "8"); break;
                            case 9: System.out.println( "9"); break;
                            case 10: System.out.println( "A"); break;
                            case 11: System.out.println( "B"); break;
                            case 12: System.out.println( "C"); break;
                            case 13: System.out.println( "D"); break;
                            case 14: System.out.println( "E"); break;
                            case 15: System.out.println( "F"); break;
                        }    
                    
                        switch ( threeNumbersThree%16 ) {
                            case 0: System.out.println( "0"); break;
                            case 1: System.out.println( "1"); break;
                            case 2: System.out.println( "2"); break;
                            case 3: System.out.println( "3"); break;
                            case 4: System.out.println( "4"); break;
                            case 5: System.out.println( "5"); break;
                            case 6: System.out.println( "6"); break;
                            case 7: System.out.println( "7"); break;
                            case 8: System.out.println( "8"); break;
                            case 9: System.out.println( "9"); break;
                            case 10: System.out.println( "A"); break;
                            case 11: System.out.println( "B"); break;
                            case 12: System.out.println( "C"); break;
                            case 13: System.out.println( "D"); break;
                            case 14: System.out.println( "E"); break;
                            case 15: System.out.println( "F"); break;
                        }

                    }
                        
                    else {
                        System.out.println("Sorry, you must enter an values between 0-255. ");
                        return;
                    }
    
                }
        
                else {
                    System.out.println("Sorry, you must enter an values between 0-255. ");
                    return;
                }
            
            }
        
            else {
                System.out.println("Sorry, your input must consist of integers. ");
                return;
            }
        
        
            
        }   //end of main method
    }   //end of the class