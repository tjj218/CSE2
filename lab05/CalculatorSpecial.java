//Tamara Johnson
//CSE 002 310
//Lab5- Special Calculator
//9/25/15
//Create a program that acts like a calculator and prompts 
//users to enter numbers and operators.


// import scanner class
import java.util.Scanner;

// define class
public class CalculatorSpecial{
//add main method
    public static void main(String[] args){
        //declare a variable to store the n to stop
        String y = "u";
        int cont = 0;
        
        // Create an instance that will take input from STDIN
            Scanner myScanner = new Scanner ( System.in );
            while (cont == 0){
            // ask user for first number
            System.out.print("Please enter the first number ");
            //create a variable using the users input
            double intA = myScanner.nextDouble() ;
            // ask user for second number
            System.out.print("Please enter the second number ");
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
                break;}
            System.out.print("If you want to stop the program press n or N ");
            y = myScanner.next();
            if (y.equals("n")){
                 cont = 1;
            }
            if (y.equals("N")){
                 cont = 1;
            }
            }
    }
}