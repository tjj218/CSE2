//Tamara Julia Johnson
//CSE 002 310
//Lab 6- timeSheets
//10/2/15
//Create a program that acts as a timesheet that calculates the total pay for all employees

// import scanner class
import java.util.Scanner;

// define class
public class timeSheets{

//add main method
    public static void main(String[] args){
        
        // Create an instance that will take input from STDIN
            Scanner myScanner = new Scanner ( System.in );//  The purpose of this program is to calculate the total amount an employer needs to pay all employees.
            //declare a variable for all employees and for the total payroll
            int employees = 0;
            double totalPayroll = 0;

        
        //ask user for number of employees
        System.out.print("Enter the total number of current employees ");
        employees = myScanner.nextInt();
        
       
        //Insert for loop to find the amount of money each employee is paid
        for (int d=0; d<employees; d++){
            //declare variables
            double hrWage = 0;
            int numOfDays = 0;
            double weekWage = 0;

            //Ask user for days worked and hr Wage
            System.out.print("How many days a week does your number " + (d+1) + " employee work? ");
            numOfDays = myScanner.nextInt();
            System.out.print("How much does this employee make every hour that he works? ");
            hrWage = myScanner.nextDouble();
            
                        //nest a for loop to discover the weekly wage
                        for (int w=0; w<numOfDays; w++){
                        int hrs = 0;
                        //Ask user how many hours were worked on a given day
                        System.out.print("How many total hours did this employee work on day number " + (w+1) + "? ");
                        hrs = myScanner.nextInt();
                        //increase Week wage by answers given by user above
                        weekWage =weekWage+(hrWage*hrs);}
                        
            //increase total pay by above number for each employee
            totalPayroll =weekWage+totalPayroll;}
            
            
            
            
        //Now print total payroll!
        System.out.println("Your total payroll comes to a total of $" + totalPayroll);
    }
}