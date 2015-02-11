//////////////////////////////
//Yung Ching Yang
//February 6 2015
//Root Java Program
//It is a program that prompts the user to enter a double and then prints out a crude estimate of the cube 
//root of the number and the value of this crude guess when cubed.
// 
//  first compile the program
//      javac Root.java
//  run the program
//      java Root//
//
    import java.util.Scanner;   //import scanner
//    
//  define a class
        public class Root {
//  main method required for every Java program
        public static void main (String[ ] args) {
//
    Scanner myScanner;  //to accept input
    myScanner = new Scanner( System.in ) ;  //construct an instance of the Scanner class
//
//  User input
        System.out.print("Enter a double, and I print its cube root- ");  //Prompt the user for the a double
        double valueX = myScanner.nextDouble(); //Accept user input of value x
        double guess = valueX/3.125129485503486; //assign guess (square root)
        double cubeRoot = ((guess * guess * guess + valueX) / ( 3 * guess * guess));  //estimation of cube root
        double rootCube = ((cubeRoot*cubeRoot)*cubeRoot);   //assign the multiplication of three cube roots
    
//  Print out the output data.
        System.out.println("The cube root is " + cubeRoot + ":");   //show cuberoot of x
        System.out.println(cubeRoot + "*" + cubeRoot + "*" + cubeRoot + " = " + rootCube);    //show the mutiplication of three cube roots
//
    }   //end of the main method
}   //end of the class