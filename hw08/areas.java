//Tamara Julia Johnson
//CSE 002 310
//HW08-Areas
//10/27/15
// After asking user to input a shape name either circle rectangle or trapezoid then compute the area for that shape.

// import scanner class
    import java.util.Scanner;
        //define class
            public class areas{
             //add main method
                
                public static void main(String[] args){
                    //create an instance that will take input from STDIN
                        Scanner myScanner = new Scanner ( System.in );
		            //declare variable for area
		                double area = 0;
		            //ask user for a shape or to exit the program
		            System.out.print("Please type either circle, rectangle or trapezoid or type exit to exit this program: ");
		            //set user input to the string shape
		            String shape = myScanner.next();
		                //create a loop that will run unless the user types exit
		                while (!(shape.equalsIgnoreCase("exit"))){	
			                  
			                  //if the user typed circle then
			                    if(shape.equalsIgnoreCase("circle")){
			                    	//ask for a specific radius and create variables
				                        System.out.print("Please enter a radius for this circle: ");
				                        int radius = myScanner.nextInt();
				                    //call area method, sets variable area to the the area with input radius, and print results
				                        area = area(radius);
				                        System.out.println("The area of the circle you requested is "+area+".");}
				                        
			                  //if the user typed rectangle then
		        	            if(shape.equalsIgnoreCase("rectangle")){
			                        //ask for length and width to create variables
			                        	System.out.print("Please enter the length for this rectangle: ");
			                        	int length = myScanner.nextInt();
			                        	System.out.print("Please enter the width for this rectangle: ");
			                            int width = myScanner.nextInt();
			                    	//calls area method, set area equal to the area with inputs length and width, and print results
				                        area = area(length,width);
				                        System.out.println("The area of the rectangle you requested is "+area+".");}
			
			                  //if the user typed trapezoid then
			                    if(shape.equalsIgnoreCase("trapezoid")){
				                    //ask for height, and two bases to create variables
				                        System.out.print("Please enter the height for this trapezoid: ");
			                            int height = myScanner.nextInt();
				                        System.out.print("Please enter the length of the first base for this trapezoid: ");
				                        int base1 = myScanner.nextInt();
				                        System.out.print("Please enter the length of the second base for this trapezoid: ");
				                        int base2 = myScanner.nextInt();
				                    //calls area method, set area equal to the area with inputs height, base1 and base2, and print results
				                        area = area(height,base1,base2);
				                        System.out.println("The area of the trapezoid you requested is "+area+".");}
			
			                 //if none of the above are true say invalid input
			                   else if (!(shape.equalsIgnoreCase("circle")) && !(shape.equalsIgnoreCase("rectangle")) && !(shape.equalsIgnoreCase("trapezoid"))){//begin else if
				                        System.out.println("Sorry that input is invalid, please enter valid input");}
			
			     //enter new shape or exit again	
			        System.out.print("Please type either circle, rectangle or trapezoid or type exit to exit this program: ");
		            shape = myScanner.next();}
	}
	
	//area method that for 1 number aka circle
    	public static double area(int radius){
		//Calculate area of circle using power method and pi method and return area
		double area = Math.PI * Math.pow(radius, 2);
		return area;}
	
	//area method for 2 numbers aka rectangle
	    public static double area(int length, int width){
		//Calculate area of rectangle and return area
		double area = length * width;
		return area;}
	
	//area method for 3 numbers aka trapezoid
	    public static double area(int height, int base1, int base2){
	    //Calculate area of trapezoid and return area
		double area = ((base1+base2)/2) * height;
		//returns double area
		return area;}

    
    
    
    
}