//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//March 6 2015
//Waves Java Program
//It is a program that forces the user to enter an integer between 1 and 30, inclusive, and then prints out 
//displays that depend on the value entered and look like waves.

//
//  first compile the program
//      javac waves.java
//  run the program
//      java waves//
//    
//

    import java.util.Scanner;   //import Scanner

    public class waves {  //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
        
            Scanner myScanner;  //to accept input
            myScanner = new Scanner( System.in );  //construct an instance of the Scanner class
            
            int input;  //declare input variable
            int z;  //declare manipulating variable for the main loop
            int n;  //declare manipulating variable
            int a;  //declare variable a
            int b;  //declare variable b
            int c;  //declare variable c
            int d;  //declare variable d
            int e;  //declare variable e
            int f;  //declare variable f
            int g;  //declare variable g
            int h;  //declare variable h
            int i;  //declare variable i
            int j;  //declare variable j
            int k;  //declare variable k
            int l;  //declare variable l
            
        
            System.out.print("Enter a number between 1 and 30: ");  //prompt the user to enter a number between 1 and 30
            
            for ( z=2; z<=2; z++ ) {    //the start of the main loop
            
                if ( myScanner.hasNextInt() ){  //check if the input is an integer
                    input = myScanner.nextInt();    //assign input as a variable of input
                    
                    if ( input >= 1 ) { //check if input is equal or greater than 1
                        
                        if ( input <= 30 ) {    //check i input is equal or smaller than 30
                            
                            System.out.println(""); //create an empty line before the for loop
                            
                            
                            System.out.println("FOR LOOP: ");   //print the message "FOR LOOP"
                            
                            //Start of FOR LOOP
                            for ( n=1; n<=input; n++ ) {
                                
                                if ( (n % 2) == 1 ) {   //if the showed number is odd
                                    
                                    //show the opposite pyramid
                                    for ( a=1; a<=n; a++) {
                                        for ( b=n; b>a; b--){
                                            System.out.print(n);    //print n in a row
                                        }
                                        System.out.println(n);    //print the last n of the row
                                    }
                                    
                                }
                                
                                else if ( (n % 2) == 0 ) {  //if the showed number is even
                                    
                                    //show the pyramid
                                    for ( c=1; c<=n; c++) {
                                        for ( d=1; d<c; d++){
                                            System.out.print(n);    //print n in a row
                                        }
                                        System.out.println(n);    //print the last n in a row
                                    }

                                }
                                
                            }
                            
                            System.out.println(""); //create an empty line before while loop
                            
                            System.out.println("WHILE LOOP: ");  //print the message "WHILE LOOP"
                            
                            //Start of WHILE LOOP
                            n=1;
                            while ( n<=input ) {
                                
                                if ( (n % 2) == 1 ) {   //if the showed number is odd
                                    
                                    //show the opposite pyramid
                                    e=1;
                                    while ( e<=n ) {
                                        f=n;
                                        while ( f>e ) {
                                            System.out.print(n);    //print n in a row
                                            f--;
                                        }
                                        System.out.println(n); //print the last n in a row
                                        e++;
                                    }
                                    
                                }
                                
                                else if ( (n % 2) == 0 ) {  //if the showed number is even
                                    
                                    //show the pyramid
                                    g=1;
                                    while ( g<=n ) {
                                        h=1;
                                        while ( h<g ){
                                            System.out.print(n);    //print n in a row
                                            h++;
                                        }
                                        System.out.println(n);  //print the last n in a row
                                        g++;
                                    }

                                }
                                
                                n++;
                                
                            }
                            
                            System.out.println(""); //create an empty line before do-while loop
                            
                            System.out.println("DO-WHILE LOOP: ");   //show the message "DO-WHILE LOOP"
                            
                            //Start of DO-WHILE LOOP
                            n=1;
                            do {
                                
                                if ( (n % 2) == 1 ) {   //if the showed number is odd
                                    
                                    //show the opposite pyramid
                                    i=1;
                                    do {
                                        j=n;
                                        if (j>1) {
                                            do {
                                                System.out.print(n);    //print n in a row
                                                j--;
                                            } while ( j>i );
                                            System.out.println(n);  //print the last n in a row
                                        }
                                        i++;
                                    } while ( i<n );
                                    System.out.println(n);  //print the last n
                                    
                                }
                                
                                else if ( (n % 2) == 0 ) {  //if the showed number is even
                                    
                                    //show the pyramid
                                    k=1;
                                    do {
                                        l=1;
                                        if ( k>1 ) {
                                        do {
                                            System.out.print(n);    //print n in a row
                                            l++;
                                        } while ( l<k );
                                        }
                                        System.out.println(n);  //print the last n in a row
                                        k++;
                                    } while ( k<=n );

                                }
                                
                                n++;
                                
                            } while ( n<=input );   //end of the main loop
                            
                            
                        }
                        
                        else {
                            System.out.print("Invalid input, enter again \n");  //print the reenter message
                            z--;    //continue the loop
                        }
                        
                    }
                    
                    else {
                        System.out.print("Invalid input, enter again \n");  //print the reenter message
                        z--;    //continue the loop
                    }
                    
                }
            
                else {
                    System.out.print("Invalid input, enter again \n");  //print the reenter message
                    myScanner.next();   //clear the previous inputs
                    z--;    //continue the loop
                }
            }
            
            
        }   //end of main method
    }   //end of class    