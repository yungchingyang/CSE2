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
    public class Cookies {   //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
//
        Scanner myScanner;  //to accept input
        myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
    
        System.out.print("Enter the Number of people: ");   //prompt the user to input number of people
        int nPeople;    //assign the number of people
    
        if ( myScanner.hasNextInt() ) { //check whether the input is an integer
            nPeople = myScanner.nextInt();  //assign the number of people
            
            if ( nPeople > 0 ) {
                System.out.print("Enter the number of cookies you are planning to buy: ");  //prompt the user to input the desire amount of cookies
                int nCookies;   //assign the cookies amount
                
                if ( myScanner.hasNextInt() ) { //check if the input is an integer
                    nCookies = myScanner.nextInt(); //assign the cookies amount
                    
                    if ( nCookies > 0 ) {
                        System.out.print("How many do you want each person to get? ");  //ask the user to input the cookies desired by per person
                        int nEach;  //assign the number of cookies per person
                        
                        if ( myScanner.hasNextInt() ) { //check if the input is an integer
                            nEach = myScanner.nextInt();    //assign the number of cookies per person
                            
                            if ( nEach >= 0 ) { //check if the input is a positive integer
                                
                                if ( ((nCookies / nPeople) >= nEach) ) {    //check if there is enough cookies
                                    
                                    if ( (nCookies % nPeople) == nEach ) {  //check if the cookies can be divided evenly
                                        System.out.println("You have enough cookies for each person and the amount will divide evenly.");   //give a success message that the cookies can be divided to everyone evenly
                                        return; //quit the program
                                    }
                                    
                                    else if ( (nCookies % nPeople) == 0 ) { //check if the cookies can be divided evenly
                                        System.out.println("You have enough cookies for each person and the amount will divide evenly.");   //give a success message that the cookies can be divided to everyone evenly
                                        return; //quit the program
                                    }
                                    
                                    else {
                                        System.out.println("You have enough, but they will not divide evenly"); //state that there is no enough cookies
                                        return; //quit the program
                                    }
                                }
                                
                                else {
                                    System.out.println("You will not have enough cookies. You need to bu at least " + ((nPeople * nEach) - nCookies) +" more. ");   //give the advice to buy more cookies
                                    return; //quit the program
                                }
                        
                            }
                            
                            else {
                                System.out.println("You did not enter an int > 0. ");   //return an error message
                                return; //quit the program
                            }
                            
                        }
                        
                        else {
                            System.out.println("You did not enter an int"); //enter an error message
                            return; //quit the program
                        }
                        
                    }
                    
                    else{
                        System.out.println("You did not enter an int > 0"); //return an error message
                        return; //quit the program
                    }
                    
                }
                
                else {
                    System.out.println("You did not enter an int.");    //return an error message
                    return; //quit the program
                }
                
            }       
            
            else {
                System.out.println("You did not enter an int > 0"); //return an error message
                return; //quit the program
            }
        
        }
    
        else {
            System.out.println("You did not enter an int"); //return an error message
            return; //quit the program
        }
    
    }   //end of the main method
}   //end of the class