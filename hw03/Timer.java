// CSE 002 310
// HW 03 - Timer
// 9/14/2015
//
//
// import scanner class
import java.util.Scanner;
// define class
    public class Timer{
    //  add main method required for every java program
        public static void main(String[] args){
            // Create an instance that will take input from STDIN
            Scanner myScanner = new Scanner ( System.in );
             // ask user for time
            System.out.print("Please enter current time in military time: ");  
            // Create variable for current time
            int timeNow = myScanner.nextInt() ;
            //create variables for current time hours and min
            int nowHrs= (int)(timeNow)/100;
           int nowMin= (int)(timeNow)%100;
           //ask for dinner time
            System.out.print("Please enter the time that you want to eat dinner in military time: ");
            // Create variable for dinner time
            int timeDin = myScanner.nextInt();
            //create variable for dinner time hours and min
             int dinHrs= (int)(timeDin)/100;
           int dinMin= (int)(timeDin)%100;
           int finalHrs= dinHrs-nowHrs;
           int finalMin= dinMin-nowMin;
           System.out.println("You have " + finalHrs + " hours and " + finalMin + " minutes until dinner");
           
        }}