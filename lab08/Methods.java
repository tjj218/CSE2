//Tamara Julia Johnson
//CSE 002 310
//Lab08-Methods
//10/15/15
// Ask the user for 10 numbers, find the mean and median then print results using different methods.

// import scanner class
    import java.util.Scanner;
        //define class
            public class Methods{
             
             //add main method
                public static void main(String[] args){
                    //create main variables    
                        double mean;
                        double median;
                      //create an instance that will take input from STDIN
                        Scanner myScanner = new Scanner ( System.in );
                        //create all variables
                            System.out.println("Enter the smallest number: ");
                            double a = myScanner.nextDouble();
                            System.out.println("Enter the next smallest number: ");
                            double b = myScanner.nextDouble();
                            System.out.println("Enter the next smallest number: ");
                            double c = myScanner.nextDouble();
                            System.out.println("Enter the next smallest number: ");
                            double d = myScanner.nextDouble();
                            System.out.println("Enter the next smallest number: ");
                            double e = myScanner.nextDouble();
                            System.out.println("Enter the next smallest number: ");
                            double f = myScanner.nextDouble();
                            System.out.println("Enter the next smallest number: ");
                            double g = myScanner.nextDouble();
                            System.out.println("Enter the next smallest number: ");
                            double h = myScanner.nextDouble();
                            System.out.println("Enter the next smallest number: ");
                            double i = myScanner.nextDouble();
                            System.out.println("Enter the biggest: ");
                            double j = myScanner.nextDouble();

                            mean = Mean(a,b,c,d,e,f,g,h,i,j);
                            median = Median(e,f);
                            print(mean,median);
                    }
                    
    
    //method to calculate mean
    public static double Mean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){
        double mean = (a+b+c+d+e+f+g+h+i+j)/10;
        return mean;
    }
    
    
    //method to calculate median
    public static double Median(double e, double f){
        double median = (e+f)/2;
        return median;
    }
    
    
    //method to print
    public static void print(double mean, double median){
        System.out.println("The mean is: " + mean);
        System.out.println("The median is: " + median);
        return;
    }
    
    
    }   
           