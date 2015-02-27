//////////////////////////////////////////////////////////////////////
//Yung Ching Yang
//February 27 2015
//Smile Generator Java Program
//It is a program that generate smiley faces using loop method
//
//  first compile the program
//      javac SmileGenerator.java
//  run the program
//      java SmileGenerator//
//    
//
    public class SmileGenerator {  //define a class
        public static void main (String[ ] args) {  //main method required for every Java program
        
            int number = (int)(Math.random()*101);   //produce the random year number
        
            //Step 1
            //Non-nested for loop (Print 5 smiley faces)
            int i;
            for (i = 0; i<4; i++) {
                System.out.print(":)");
            }
            System.out.println(":)");
            
            //While Loop (Print 5 smiley faces)
            int j = 0;
            while (j < 4) {
                System.out.print(":)");
                j++;
            }
            System.out.println(":)");
            
            //Do-while loop (Print 5 smiley faces)
            int k = 0;
            do {
                System.out.print(":)");
                k++;
            } while (k < 4);
            System.out.println(":)");
            
            
            //Step 2 (Print random number of smiley faces between 1 to 100)
            int a = 0;
            while ( a < (number-1)) {
                System.out.print(":)");
                a++;
            }
            System.out.println(":)");
            
            //Step 3 (Print random number smiley faces in limit of 30 per line )
            int b = 0; 
            int c = number/30;
            while ( c <= 3 ) {
                while ( b < 29) {
                    System.out.print(":)");
                    b++;
                    }
                System.out.println(":)");
            c++;
            b=0;
            }
            while ( b < ( (number%30) - 1 ) ) {
                System.out.print(":)");
                b++;
            }
            System.out.println(":)");
            
            //Step 4 (Print smiley faces in pyramid)
            for (int d=0; d<7; d++) {
                for (int e=0; e<d; e++){
                    System.out.print(":)");
                }
                System.out.println(":)");    
            }
            

        }   //end of main method
    }   //end of the class