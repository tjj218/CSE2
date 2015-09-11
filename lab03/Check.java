// Tamara Johnson
// CSE 002 310
// Lab 03 - A dinner check
// 9/11/2015
// Create a program that uses the scanner class to obtain from the user the
// original cost of the check, the percentage tip they wish to pay, and the number
// of ways the check will be split. Then determine how much each person must pay
//
//
// import scanner class

import java.util.Scanner;

// define class
    public class Check{
    //  add main method requiewd for every java program
        public static void main(String[] args){
            // Create an instance that will take input from STDIN
            Scanner myScanner = new Scanner ( System.in );
            // ask user for cost of the check
            System.out.print("Enter the original cost of the check in the form xx.xx: ");
            //create a variable using the users input
            double checkCost = myScanner.nextDouble() ;
            //prompt user for the tip percentage they wish to pay
            System.out.print("Enter the percentage tip that you wish to pay as a whole number ( in the form xx) : " );
            //create a tip variable using the input
            double tipPercent = myScanner.nextDouble() ;
            tipPercent /= 100; //We want to convert the percentage into a decimal value
            //prompt user for the number of people that went to dinner
            System.out.print("Enter the number of people who went out to dinner: ");
            //create variable for people at dinner
            int numPeople = myScanner.nextInt() ;
            
            //output the amount each person must spend
            
            double totalCost;
            double costPerPerson;
            int dollars, //whole dollar amount of cost
                dimes, pennies; //for storing digits to the right of the decimal point for the cost$
                totalCost= checkCost * (1+tipPercent);
                costPerPerson = totalCost / numPeople ;
                //get whole amount, dropping decimal fraction
                dollars=(int)costPerPerson;
                //get dimes amount, e.g.,
                //(int) (6.73 * 10) % 10 -> 67 % 10 -> 7
                // where the % (mod) operator returns the remainder
                // after the division: 583%100 -> 83, 27%5 -> 2
                dimes=(int)(costPerPerson * 10) % 10;
                pennies=(int)(costPerPerson * 100) % 10;
                System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
                
                
            
            
            
        } //end of main method
    } //end of class