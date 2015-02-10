//////////////////////////////
//Yung Ching Yang
//February 6 2015
//Bicycle Java Program
//It is a program that prompts the user to enter two digits, the first giving the number of counts on a 
//cyclometer and the second giving the number of seconds during which the counts occurred, and then an then 
//prints out the distance traveled and the average miles per hour.
// 
//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle//
//
    import java.util.Scanner;   //import scanner
//    
//  define a class
        public class Bicycle {
//  main method required for every Java program
        public static void main (String[ ] args) {
//
    Scanner myScanner;  //to accept input
    myScanner = new Scanner( System.in ) ;  //construct an instance of the Scanner class
//
//  User input
        System.out.print("Enter the number of seconds: ");  //Prompt the user for the number of seconds
        int nSeconds = myScanner.nextInt(); //Accept user input of seconds
//
        System.out.print("Enter the number of counts: ");   //Prompt the user for the number of counts
        int nCounts = myScanner.nextInt();    //Accept user input of counts
//
//  our intermediate variables and output data.
        double wheelDiameter=27.0, // Diameter of wheel
        PI=3.14159, //The value of PI
        feetPerMile=5280,   //Feet per mile
        inchesPerFoot=12,   //Inches per foot
        secondsPerMinute=60;    //Seconds per minute
        double distanceTrip; //Assign the distance of the trip
        distanceTrip=nCounts*wheelDiameter*PI;  //gives distance in inces (for each count, a rotation of the 
                                                //wheel travels the diameter in inches times PI)
        double distanceMiles;   //assign distance in miles
        distanceMiles=distanceTrip/(inchesPerFoot*feetPerMile);  // Gives distance in miles
        int intDistanceMilesHundred = (int)(distanceMiles * 100);   //Distance times 100
        double finalDistanceMiles = (double)(intDistanceMilesHundred/100.0); //Final distance in two decimals
        double nMinutes;    //assign minutes
        nMinutes = nSeconds/60; //minutes calculation
        int intMinutesHundred = (int)(nMinutes * 100);  //Minutes times 100
        double finalMinutes = (double)(intMinutesHundred / 100.0);   //final minutes in two decimals
        double nHours;  //assign hours
        nHours = (finalMinutes/60);   //hours calculation
        double averageMPH = distanceMiles/nHours;  //assign average mph
        int intAverageMPH = (int)(averageMPH * 100);    //average mph times 100
        double finalMPH = (double)(intAverageMPH / 100.0);  //final mph in two decimals
        
//
//  Print out the output data.
        System.out.println("The distance was " + finalDistanceMiles + " and took " + finalMinutes + " minutes.");   //show distance and minutes
        System.out.println("The average mph was " + finalMPH);    //show mph
//
    }   //end of the main method
}   //end of the class