//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//March 20 2015
//HW8 Java Program
//It is a program that creates a game using different methods

//
//  first compile the program
//      javac HW8.java
//  run the program
//      java HW8//
//  

    import java.util.Scanner;   //import Scanner

    public class HW8 {  //start of the class
        
        //The main game method
        public static void main(String[] args) {    //start of the main method
            char option;    //declare variable
            String input;   //declare variable
            Scanner scan = new Scanner(System.in);  //construct an instance of the Scanner class
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!"); //show the opening message
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");    //ask the user if want to continue
            getInput(scan, "Cc");   //call method
            System.out.println("You are in a dead valley.");    //show the message
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");    //ask the user if want to continue
            getInput(scan, "Cc");   //call method
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave(); //call method
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");    //ask the user if want to continue
            getInput(scan, "Cc");   //call method
            System.out.println("You entered a cave!");  //show the message
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");    //ask the user if want to continue
            getInput(scan, "Cc");   //call method
            System.out.println("Unfortunately, you ran into a GIANT!"); //show the message
            giant();    //call the method
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");  //ask if the user wants to attack or escape
            getInput(scan, "AaEe", 10); //call the message
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");  //show the message
            System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");   //ask user which box to use
            box();  //call the method
            getInput(scan); //call the method
            System.out.println("Hero! Have a good day!");   //show the last message
            
        }   //end of main method
        
        //The method for the giant picture
        public static void giant() {
            System.out.println("                                 ---------                    ");
            System.out.println("                                |  /    \\|                   ");
            System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
            System.out.println("                           H     -----------   H              ");
            System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
            System.out.println("                           H    HHHHHHHHHHH    H                      ");
            System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
            System.out.println("                                HHHHHHHHHHH                   ");
            System.out.println("                                HHH     HHH                   ");
            System.out.println("                               HHH       HHH                   ");
        }   //end of giant method
        
        //The method for the cave picture
        public static void cave() {
            System.out.println("                              *****   * * * * * * * *        ");
            System.out.println("                         ***         ***                      ");
            System.out.println("                      ***               ***                   ");
            System.out.println("                 |    ***               ***                   ");
            System.out.println("                 |    ***               ***                   ");
            System.out.println("             O __|__  ***               ***                   ");
            System.out.println("           ******l    ***               ***                   ");
            System.out.println("            * *       ***               ***                   ");
            System.out.println("           *   *      ********************* * * * * * *       ");
        }   //end of cave method
        
        //The method for the box picture
        public static void box(){
            System.out.println("                     *********************     *********************    *********************             ");
            System.out.println("                     ***               ***     ***               ***    ***               ***              ");
            System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
            System.out.println("                     ***               ***     ***               ***    ***               ***              ");
            System.out.println("                     *********************     *********************    *********************               "); 
        }   //end of box method
        
        //The method that asks if the user wants to continue
        public static void getInput (Scanner scan, String string) { //start of method
            System.out.print("");   //accept input
            String one = scan.next();   //declare and assign variable for input
            if ( !one.equalsIgnoreCase("c") ) { //if input is not c or C
                System.out.println("Yea right LOSER!"); //show the loser message
                System.exit(1); //quit the program
            }

        }   //end of the continuing method
        
        //The method that accept the user's reaction when meeting giant
        public static void getInput(Scanner scan, String string, int trial) {   //start of the method 
            String two; //declare a String variable called two
            System.out.print("");   //accept user input
            int aNumber = 0;    //initialize the aNumber to be 0
            int eNumber = 0;    //initialize the eNumber to be 0
            int n = 0;  //initialize the controlling factor to be 0
            
            while ( n!=trial || eNumber!=trial) {   //start the loop when total attack or total escape does not equal to 10
                two  = scan.next(); //declare and assign variable two to the input
            
                if ( two.equalsIgnoreCase("a") )  { //if the input equals to a or A
                        aNumber = (int)(Math.random()*2);   //assign aNumber to a random number between 0 and 1
                        
                        if ( aNumber==0 ) { //if aNumber =0
                            System.out.println("Gosh! How can you miss it!");   //show the attack failed message
                        }
                        
                        else if ( aNumber==1) { //if aNumber equals 1
                            System.out.println("Critical Hit!");    //show the attack success message
                            n++;    //increase the value of n
                            if ( n==10) {   //if n equals to 10
                                break;  //break the method
                            }
                        }    
                        
                }
            
                else if ( two.equalsIgnoreCase("e") ) { //if the user input is e or E
                    eNumber = 1 + (int)(Math.random()*trial);   //assign eNumber to a random number between 1 and 10
                    if ( eNumber==trial ) { //if eNumber equals to trial
                        System.out.println("Escaped successfully"); //show the escape success message
                        break;  //break the method
                    }
                }
                
                else {  // if the input is not a or A or e or E
                    System.out.println("Executed by the GIANT! Game Over!");   //show the game over message 
                    System.exit(1); //quit the program
                }
                
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");  //show the message if the loop continues            
            
            }
            
        }   //end of the reaction method
        
        //The method to choose a box
        public static void getInput(Scanner scan) { //start of the method
            int three;  //declare a variable
            System.out.print("");   //accept the user input
            
            while ( !scan.hasNextInt() ) {  //if the user input is not an integer
                   System.out.print("You did not enter an integer. Try again!");    //show the retype message
                   System.out.println("");  //switch to next line
                   scan.next(); //accept input
            }
                    
            three = scan.nextInt(); //assign variable three to the user input 
            switch ( three ) {  //enter the switch condition
                case 1: System.out.println("It is GPA4.00"); break; //if user chooses box 1, show the message and break the method
                case 2: System.out.println("It is GPA4.00"); break; //if user chooses box 2, show the message and break the method
                case 3: System.out.println("It is GPA4.00"); break; //if user chooses box 3, show the message and break the method
                default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL"); System.exit(1);    //show the error message and quit the game
            }   
     
            
        }   //end of the choosing method
    
    }   //end of the main class