//Tamara Julia Johnson
//CSE 002 310
//Lab12-Mve_Arrays
//11/05/15
//Create a program that will change the array by shifting a selected index to the end


// import scanner class
import java.util.Scanner;
        //define class
            public class move_array{
                 //add main method
                    public static void main(String[] args) {
                        // Create an instance that will take input from STDIN
                            Scanner myScanner = new Scanner ( System.in );
	                                //ask user how large they would like the array to be and creates variable for it
	                                    System.out.println("How big should the array be? ");
	                                    int s = myScanner.nextInt();
	                                   
	                                    //insert try statement to check validity of statement
	                                        try{ while(s > 100 || s < 0){ 
	    		                                System.out.println("Please enter a valid size");}}
	    		                        //insert catch statement for the program to run
	                                        catch(ArrayIndexOutOfBoundsException e){ while(s< 100 && s> 0){ 
	    		                                break;}}
	    		                                //set size of array to s and fill it with random values and print it
	                                                int[] array = new int[s]; 
	                                                for(int i = 0; i < array.length; i++){
	    	                                        array[i] = (int)(Math.random()*100);
	    	                                        System.out.print(array[i] + " "); }
	    	                                        System.out.println("");
	    	                                   //ask user what index they would like to move to the end
	                                                System.out.println("Which index would you like to place at the end of this array? ");
	                                                int t = myScanner.nextInt();
	                                                    try{while(t > array.length-1 || t < 0){ 
	    		                                            System.out.print("Please enter a valid number");
		                                                	t = myScanner.nextInt(); }}
	                                                    catch(ArrayIndexOutOfBoundsException e){while(t < array.length-1 || t >= 0){
	    		                                        break;}}
	    		                             //create variable to shift with
	                                        int shift = 0; 
	                                        //for loop to shift with
	                                        for(int i = t; i <array.length-1; i++){ 
	    	                                    if(i<array.length-1){
	    		                                shift =array[i];
	    		                                array[i]=array[i+1];
	    		                                array[i+1] = shift;}   }
	    
	                                        for(int i = 0; i < array.length; i++){ 
	                            	            System.out.print(array[i]+ " "); }
	                            	            System.out.println("");
	}

}