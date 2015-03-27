//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//March 27 2015
//Waves Java Program
//It is a program that generates random sentences.
//
//  first compile the program
//      javac RandomSentence.java
//  run the program
//      java RandomSentence//
//    
//

    import java.util.Random;
    import java.util.Scanner;   //import Scanner

    public class RandomSentence {  //define a class
        
        //The adjective method
        public static String adjective  ( ) {
            
            String a = "a"; //declare a variable
            
            //Generate random numbers from 0 to 9
            Random randomGenerator = new Random();
            int randomOne = randomGenerator.nextInt(10);
            
            //assign the random numbers into different adjectives
            switch ( randomOne ) {   //check the switch cases
                case 0: a = "red"; break;
                case 1: a = "happy"; break;
                case 2: a = "young"; break;
                case 3: a = "random"; break;
                case 4: a = "shiny"; break;
                case 5: a = "strong"; break;
                case 6: a = "proud"; break;
                case 7: a = "fast"; break;
                case 8: a = "cool"; break;
                case 9: a = "sleepy"; break;
            }   // end of switch
            
            return a;   //set the output
            
        }
        
        //The subject method
        public static String subject  ( ) {
            
            String b = "b"; //declare a variable
            
            //Generate random numbers from 0 to 9
            Random randomGenerator = new Random();
            int randomTwo = randomGenerator.nextInt(10);
            
            //assign the random numbers into different adjectives
            switch ( randomTwo ) {   //check the switch cases
                case 0: b = "man"; break;
                case 1: b = "baby"; break;
                case 2: b = "rabbit"; break;
                case 3: b = "woman"; break;
                case 4: b = "team"; break;
                case 5: b = "fox"; break;
                case 6: b = "character"; break;
                case 7: b = "boy"; break;
                case 8: b = "player"; break;
                case 9: b = "dancer"; break;
            }   // end of switch
            
            return b;   //set the output
            
        }
        
        //The verb method
        public static String verb  ( ) {
            
            String c = "c"; //declare a variable
            
            //Generate random numbers from 0 to 9
            Random randomGenerator = new Random();
            int randomThree = randomGenerator.nextInt(10);
            
            //assign the random numbers into different adjectives
            switch ( randomThree ) {   //check the switch cases
                case 0: c = "chased"; break;
                case 1: c = "ate"; break;
                case 2: c = "broke"; break;
                case 3: c = "taught"; break;
                case 4: c = "played"; break;
                case 5: c = "made"; break;
                case 6: c = "took"; break;
                case 7: c = "saw"; break;
                case 8: c = "put"; break;
                case 9: c = "loved"; break;
            }   // end of switch
            
            return c;   //set the output
            
        }
        
        //The second adjective method
        public static String adjectiveTwo  ( ) {
            
            String d = "d"; //declare a variable
            
            //Generate random numbers from 0 to 9
            Random randomGenerator = new Random();
            int randomOne = randomGenerator.nextInt(10);
            
            //assign the random numbers into different adjectives
            switch ( randomOne ) {   //check the switch cases
                case 0: d = "red"; break;
                case 1: d = "happy"; break;
                case 2: d = "young"; break;
                case 3: d = "random"; break;
                case 4: d = "shiny"; break;
                case 5: d = "strong"; break;
                case 6: d = "proud"; break;
                case 7: d = "fast"; break;
                case 8: d = "cool"; break;
                case 9: d = "sleepy"; break;
            }   // end of switch
            
            return d;   //set the output
            
        }
        
        //The object method
        public static String object  ( ) {
            
            String e = "e"; //declare a variable
            
            //Generate random numbers from 0 to 9
            Random randomGenerator = new Random();
            int randomFour = randomGenerator.nextInt(10);
            
            //assign the random numbers into different adjectives
            switch ( randomFour ) {   //check the switch cases
                case 0: e = "ice-cream"; break;
                case 1: e = "toy"; break;
                case 2: e = "cards"; break;
                case 3: e = "students"; break;
                case 4: e = "computer"; break;
                case 5: e = "book"; break;
                case 6: e = "school"; break;
                case 7: e = "mouse"; break;
                case 8: e = "pencil"; break;
                case 9: e = "honey"; break;
            }   // end of switch
            
            return e;   //set e as output
            
        }
        
        //The main method
        public static void main (String[ ] args) {  //main method required for every Java program
            
            // The loop to ask if the user wants to continue
            for (int i = 1; i >=1; i++) {
                
                //declare variables to methods
                String a = adjective();
                String b = subject();
                String c = verb();
                String d = adjectiveTwo();
                String e = object();
            
                System.out.println("The " + a + " " + b + " " + c + " the " + d + " " + e + ".");   //print the random sentence
                
                //The loop to continue generate the random sentence
                for ( int j = 1; j>=1; j++) {
                    System.out.print("Do you want to make another sentence? Please enter 'y' or 'n': ");    //prompt the user if they want to continue
                    System.out.println();   //change to next line
                    Scanner scan = new Scanner (System.in); //construct scanner
                    String answer = scan.next();    //declare variable answer to the input
                
                    if ( answer.equalsIgnoreCase("y") ) {   //enter the condition if the user answers y
                        break;  //break the loop
                    }
                
                    else if ( answer.equalsIgnoreCase("n") ) {  //enter the condition if the user answers n
                        System.exit(1); //exit the program
                    }
                
                    else {
                        System.out.println("You did not enter either 'y' or 'n'. ");    //tell the user that he or she did not enter y or n
                    }
                    
                }   //the end of second loop
                
            }   //the end of first loop    

        }   //the end of main method
        
    }   //the end of the class