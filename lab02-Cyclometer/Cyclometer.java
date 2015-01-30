//////////////////////////////
//Yung Ching Yang
//January 30 2015
//Cyclometer Java Program
//My bicycle cyclometer (meant to measure speed, distance, etc.) records two kinds of data, the time elapsed in seconds, and the number of rotations of the front wheel during that time.
// 
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer {
    // main method required for every Java program
    public static void main (String[ ] args) {
    

//our input data.
int secsTrip1=480;  // The seconds of Trip1
int secsTrip2=3220; // The seconds of Trip2 
int countsTrip1=1561; // The counts of Trip1
int countsTrip2=9037; // The counts of Trip2

//our intermediate variables and output data.
double wheelDiameter=27.0, // Diameter of wheel
PI=3.14159, // The value of PI
feetPerMile=5280,   //  Feet per mile
inchesPerFoot=12,   // Inches per foot
secondsPerMinute=60;    //  Seconds per minute
double distanceTrip1, distanceTrip2, totalDistance; //

//print out the numbers stored in the variables that store number of seconds and the counts
    System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
    System.out.println("Trip2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        
//run the calculations; store the values.
//
//
distanceTrip1=countsTrip1*wheelDiameter*PI;
//  Above gives distance in inches
//  (foe each count, a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile;  // Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    }   //end of the main method
}   //end of class