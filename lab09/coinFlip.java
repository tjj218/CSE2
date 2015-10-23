//Tamara Julia Johnson
//CSE 002 310
//Lab09-CoinFlip
//10/23/15
// Print the results of a coin flip a certain number of times

// import scanner class and math language
    import java.util.Scanner;
    import java.lang.Math;
        //define class
            public class coinFlip{ 
    
    //create a method for a single flip
        public static String singleFlip(){ 
        double randomNum = Math.random();
        //since its a 50/50 chance if flip is greater than 0.5 it is Tails
        if (randomNum > 0.5) 
            return "Tails";
        else
            return "Heads";
    }
    
   //create a method for multiple flips by overloading one
        public static String singleFlip(int number){ 
            //create variables for heads and tails
            int heads = 0;
            int tails = 0;
            //call single flip method to use here
            if(number==0){ 
                return singleFlip();}
            else{ 
                for(int i = 0; i<number; i++){
                double flip = Math.random();
                if (flip>0.5)
                    heads++;
                else 
                    tails++;
        }
        return "Heads came up " + heads + " times and Tails came up " + tails + " times.";
        }
        }
        
    //create main method    
    public static void main(String [] args){ 
        //create an instance that will take input from STDIN
        Scanner myScanner = new Scanner (System.in); 
        boolean count = true;
        while(count){
            System.out.println("How many times do you want the coin to be flipped max 100: ");
            int i = myScanner.nextInt();
            if (i>100)
                count = false;
            
            else
              System.out.println("The coin will be on" + singleFlip(i));  
                
        }
        }
    
    }