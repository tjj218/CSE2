//Tamara Julia Johnson
//CSE 002 310
//Lab 4- Calculator
//9/18/15
//Create a program that acts like a calculator and prompts 
//users to enter numbers and operators.



// import scanner class
import java.util.Scanner;

// define class
public class Calculator{
//add main method
    public static void main(String[] args){
        // Create an instance that will take input from STDIN
            Scanner myScanner = new Scanner ( System.in );
            // ask user for first number
            System.out.print("Please enter the first number ");
            //create a variable using the users input
            double intA = myScanner.nextDouble() ;
            // ask user for second number
            System.out.print("Please enter the first number ");
            //create a variable using the users input
            double intB = myScanner.nextDouble();
            // ask user for operator
            System.out.print("Please enter operator +,-,*,or /: ");
            //create variable using answer given
            String operator = myScanner.next();
            //do math for each
            double ans1 = intA + intB;
            double ans2 = intA - intB;
            double ans3 = intA * intB;
            double ans4 = intA / intB;
            //switch statement
            switch (operator){  
                case "+": 
                    System.out.println(intA + " + " + intB + " is " + ans1);
                break;
                 case "-": 
                    System.out.println(intA + " - " + intB + " is " + ans2);
                break;
                 case "*": 
                    System.out.println(intA + " * " + intB + " is " + ans3);
                break;
                 case "/": 
                    System.out.println(intA + " / " + intB + " is " + ans4);
                break;
                 default: 
                    System.out.println( "invalid operator" );
                break;
  
            }
    }
}