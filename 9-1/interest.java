//Tamara Johnson
//CSE002-310
//Classwork 9/2

//declare class as public
public class interest{
    //add main method
    public static void main(String[] args){
        
// Write a program that will add interest to a bank account. But only add the integer part of the interest to the balance
double accountBal;
accountBal = 28739.56;
double interestRt;
interestRt = .037;
// Calculate the interest
double interest = (accountBal * interestRt);
//Round this number
double newInterest = Math.round(interest);
// Calculate the total
double total = newInterest + accountBal;
// Print total balance
System.out.println("The total account balance after adding interest is " + total); 
}
}
//alternative code
//double total1 = accountBal + (int) interest;