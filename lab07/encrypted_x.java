//Tamara Julia Johnson
//CSE 002 310
//Lab07 Encrypted_x
//10/9/15
//Create a program that makes a hidden X message

// import scanner class
import java.util.Scanner;

//define class
    public class encrypted_x{
        //add main method
             public static void main(String[] args){
                 //Create an instance that will take input from STDIN
                     Scanner myScanner = new Scanner ( System.in );
   //Create variables
    int line = 0;
    int letter = 0;
        //Ask user for size
         System.out.print("How long do you want your box to be, it can be max 100? ");
         int input = myScanner.nextInt();
    
    //Check if it is in between 0 and 101
    if (!(input > 0 && input <101)){
        System.exit(-1);}
        
    //print the box using nested for loops
    for(line = 0; line <= input; line++){
        for (letter = 0; letter <= input; letter++){
            if (line == letter || input-letter == line){
            System.out.print(" ");}
            else{
            System.out.print("*");}
        }
    System.out.println("");
    }
             }
    }