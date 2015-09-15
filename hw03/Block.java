// CSE 002 310
// HW 03 - Block
// 9/14/2015
//
// import scanner class
import java.util.Scanner;
// define class
    public class Block{
    //  add main method required for every java program
        public static void main(String[] args){
            // Create an instance that will take input from STDIN
            Scanner myScanner = new Scanner ( System.in );
             System.out.print("Enter the length of the box ");
            //create a variable using the users input
            double length = myScanner.nextDouble() ;
             System.out.print("Enter the width of the box ");
            //create a variable using the users input
            double width = myScanner.nextDouble() ;
             System.out.print("Enter the height of the box ");
            //create a variable using the users input
            double height = myScanner.nextDouble() ;
            // create volume variable
            double volume = height*width*length;
            // create surface area variable
            double surfArea = (2*width*height)+(2*length*height)+(2*width*length);
            //Print out results
            System.out.println("The Volume of the box of dimensions " + length +" X "+ width + " X " + height + " is " + volume);
            System.out.println("The Surface Area of the box is " + surfArea);
        }
    }

            
            