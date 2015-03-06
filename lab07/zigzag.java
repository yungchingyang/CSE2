//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//March 6 2015
//Zigzag Java Program
//It is a program that uses while loops and break statement
//
//  first compile the program
//      javac zigzag.java
//  run the program
//      java zigzag//
//    
//

    import java.util.Scanner;   //import Scanner

    public class zigzag {  //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
        
            Scanner myScanner;  //to accept input
            myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
        
            //Step 1 (Top line of z)
            int nStars; 
            for (nStars = 0; nStars<10; nStars++) {
                System.out.print("*");
            }
            System.out.println(""); 
            
            //Step 2 (Diagonal line of z)
            String nothing = " ";
            for (int b=0; b<10; b++) {
                for (int c=0; c<b; c++){
                    System.out.print(nothing);
                }
                System.out.println("*");    
            }
            
            //Step 3 (Bottom line of z)
            int nStarts;
            for (nStarts = 0; nStarts<10; nStarts++) {
                System.out.print("*");
            }
            System.out.println("");
            
            //Step 4
            int n;  //declare manipulating variable for the whole loop
            int i;  //declare i
            int j;  //declare j
            int k;  //declare k
            String answer;  //declare answer
            
            for ( n=2; n<=2; n++) { //start of the whole loop
                System.out.print("Enter an int between 3 and 33: ");    //prompt the user to input an integer between 3 and 33
            
                if ( myScanner.hasNextInt() ) { //check whether the input is an integer
                    nStars = myScanner.nextInt();   //assign nStars to the input
                    
                    if ( nStars>=3 ) {  //enter the condition in which nStars is bigger than or equal to 3
                        
                        if ( nStars<=33 ) { //enter the condition in which nStars is smaller than or equal to 33
                            
                            //Top line of z
                            for ( i=0; i<nStars; i++ ) {
                                System.out.print("*");
                            }
                            System.out.println("");
                            
                            //Diagonal line of z
                            for ( j=0; j<nStars; j++) {
                                for ( k=0; k<j; k++){
                                    System.out.print(nothing);
                                }
                            System.out.println("*");    
                            }
                            
                            //Bottom line of z
                            for (nStarts = 0; nStarts<nStars; nStarts++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                            
                            //Ask if the user want to repeat the program
                            System.out.print("Enter y or Y to go again: "); //prompt the user to enter y if they want to go again
                            answer = myScanner.next();
                            
                            if ( answer.equalsIgnoreCase("y") ) {
                                n--;
                            }
                            
                            else {
                                break;
                            }
                            
                            
                        }
                        
                        else {  //enter the condition if the input is bigger than 33
                            System.out.println("The number is out of range [3,33]");    //print an error message 
                            n--;    //continue the loop
                        }
                        
                    }
                    
                    else {  //enter the condition if the input is smaller than 3
                        System.out.println("The number is out of range [3,33]");    //print an error message
                        n--;    //continue the loop 
                    }
                    
                
                }
                
                else {  //enter the condition if the input is not an integer
                    System.out.println("It is not an int"); //print an error message
                    myScanner.next();   //clear the previous input
                    n--;    //continue the loop
                }
            
            
            
            
            }
            
            
            
        
        }   //end of main method
    }   //end of the class