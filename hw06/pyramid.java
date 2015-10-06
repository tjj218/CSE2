//Tamara Julia Johnson
//CSE 002 310
//HW06- Pyramid
//10/5/15
//Create a program that prints out the correct size pyramids that the user wants

// import scanner class
import java.util.Scanner;

//define class
    public class pyramid{
        //add main method
             public static void main(String[] args){
                 //Create an instance that will take input from STDIN
                     Scanner myScanner = new Scanner ( System.in );
                    
                    //create variables and ask user what size pyramid they want
                        int numRow;
                        int numStars;
                        System.out.print("How many rows would you like in your pyramid? ");
                        
                        
                    //assign answer to variable for pyramid size
                        numRow= myScanner.nextInt();
                        
                        
                         //Create for loop that determines the number of stars in each row
                            
                             for (int a = 0; a < numRow; a++){
                                numStars= ((a+1)*2)-1;
                                
                                //nest loop for spaces before the stars to create the look of a pyramid
                                     int begSpaces = numRow-a+1;
                                    for (int c = 0; c < begSpaces; c++){
                                        System.out.print(" ");
                                    }
                                    //nest loop for stars
                                   for (int b = 0; b < numStars; b++){
                                       System.out.print("*");
                                   }
                        //move to next row to continue making pyramid
                            System.out.println();
                            }
             }
    }