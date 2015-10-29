//Tamara Julia Johnson
//CSE 002 310
//Lab10-Arrays
//10/30/15
//ask the user for the number of values that are to be stored in an array of integers

//import scanner class
    import java.util.Scanner;
        //define class
            public class arrays{
             //add main method
                public static void main(String[] args){
                    //create an instance that will take input from STDIN
                        Scanner myScanner = new Scanner ( System.in );
                    //ask how many values will be in the array and create variable
                        System.out.println("How many values would you like to be stored in the array?");
                        int length = myScanner.nextInt();
                    //create the array using length
                        int[] array = new int [length];
                    
                        //loop to fill the array with random numbers
                            for(int n=0;n<length;n++){
                                array[n]= (int)(Math.random()*100.00);}
        
                        //loop to print
                            for(int i=0;i<length;i++){
                                System.out.println("The numbers are " + array[i]);}
            
        
                    //create variables
                        int sum = 0;
                        int avg = 0;
                        
                        //loop to find the sum and averages
                            for(int n=0;n<length;n++){
                                sum +=array[n];}
                    //find the average and print
                        avg = sum/length;
                        System.out.println("The sum of everything in the array is "+sum+" while the average is "+avg);
                        System.out.print("The values greater than or equal to the average are: ");
                        //loop to print values greater than or equal to average
                            for(int n = 0;n<length;n++){
                                if(array[n]>=avg){
                                 System.out.println(array[n]);}
        }
        
    }
}