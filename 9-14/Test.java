import java.util.Scanner;

public class Test{
    //add main method
    public static void main(String[] args){
    Scanner myScanner = new Scanner ( System.in );
     System.out.print("Please type first integer ");
double oneInt = myScanner.nextDouble() ;
System.out.print("Please type second integer ");
double twoInt = myScanner.nextDouble() ;
System.out.print("Please type third integer ");
double thrInt = myScanner.nextDouble() ;

double avg = (oneInt+twoInt+thrInt)/3;

System.out.println("The average of your three integers is " + avg);
}
}