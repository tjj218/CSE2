//Tamara Johnson
//CSE 002 310
//Lab 05 average Grade
//9/26/15
//Using a while statement, write a program that requests a grade to be entered.

// import scanner class
import java.util.Scanner;

// define class
public class averageGrade{
    //add main method
    public static void main(String[] args){
        //create variables outside of loops
        int totGrade = 0;
        int count = 0;
        int average = 0;
        int grade = 0;
        // Create an instance that will take input from STDIN
            Scanner myScanner = new Scanner ( System.in );
         //add while loop for numbers that aren't 999
         while (grade != 999){
             //ask user for a grade
            System.out.print("Please enter a grade ");
            grade = myScanner.nextInt();
            //check if number is less than 0 but greater than 100
            //but it also can't be 999
            if ((grade < 0)||((grade > 100)&&(grade != 999))){
             //tell user that is not valid
             System.out.println("Sorry that is not a valid grade.");
         }
         //check if grade is from 0-100
         if ((grade >= 0)&&(grade <= 100)){
             // add grade to total grades
             totGrade = totGrade + grade ;
             //add one to counter that we will divide by to get the average
             count = (count + 1);
         }
    }
    //Create this so if user imputs 999 the average is computed
    if (grade == 999){
        //compute average
        average = (totGrade / count) ;
        //print out final answer
        System.out.println("The class average is " + average);
    }
}
}
             