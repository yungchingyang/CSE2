//////////////////////////////
//Yung Ching Yang
//February 20 2015
//Space Exploration Java Program
//It is a program that outputs a timeline of significant space exploration advances from 
// 2000 - 2010.
//
//  first compile the program
//      javac SpaceExploration.java
//  run the program
//      java SpaceExploration//
//    
//
    public class SpaceExploration {  //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
        
            int year = (int)(Math.random()*11) + 2000;   //produce the random year number
        
            //Print the explanation      
            System.out.println("Here is a timeline of space exploration events from " + year + " to 2000: ");
        
            switch ( year ) {   //checki the switch cases
                case 2010: System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back.");   //print the space information in 2010
                case 2009: System.out.println("2009: N/A");   //print the space information in 2009 and before
                case 2008: System.out.println("2008: Kepler launched to study deep space");   //print the space information in 2008 and before
                case 2007: System.out.println("2007: N/A");   //print the space information in 2007 and before
                case 2006: System.out.println("2006: Spacecraft returns with collections from a comet");  //print the space information in 2006 and before
                case 2005: System.out.println("2005: Spacecraft collies with comet"); //print the space information in 2005 and before
                case 2004: System.out.println("2004: N/A");   //print the space information in 2004 and before
                case 2003: System.out.println("2003: Largest infared telescope released");    //print the space information in 2003 and before
                case 2002: System.out.println("2002: N/A");   //print the space infrmation in 2002 and before
                case 2001: System.out.println("2001: First spacecraft lands on asteroid");    //print the space information in 2001 and before
                case 2000: System.out.println("2000: First spacecraft orbits an asteroid");   //print the space information in 2000
            }   // end of switch
            
        }   //end of main method
    }   //end of the class
    