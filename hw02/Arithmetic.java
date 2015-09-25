//Tamara Johnson
//CSE 002 310
//HW02
//9/6/2015
// define class
public class Arithmetic{
    //add main method
    public static void main(String[] args){
       
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks 
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        //Total Sock Cost pre tax
        double totalSockCost$= ((double)nSocks*sockCost$);
        //Tax total for socks
        double sockTax$= (totalSockCost$*taxPercent);
        
        //Total Drinking Glass Cost pre tax
        double totalGlassCost$= ((double)nGlasses*glassCost$);
         //Tax total for glasses
        double glassesTax$= (totalGlassCost$*taxPercent);
        
         //Total Envelope Cost pre tax
        double totalEnvelopeCost$= ((double)nEnvelopes*envelopeCost$);
        //Tax total for envelope
        double envelopeTax$= (totalEnvelopeCost$*taxPercent);
        
        //Total purchase pre tax
        double preTaxTotal$= totalEnvelopeCost$+totalGlassCost$+totalSockCost$;
        //Total tax
        double totalTax$= sockTax$+envelopeTax$+glassesTax$;
        
        //Total transaction cost
        double totalTransCost$= preTaxTotal$+totalTax$;
        
        //print out final reciept
        System.out.println(nSocks+ " pairs of Socks were purchased at " + sockCost$ +" per pair");
        System.out.println(nEnvelopes+ " box of Envelopes was purchased at " + envelopeCost$);
        System.out.println(nGlasses+ " drinking glasses were purchased at "+glassCost$+" per glass");
        System.out.printf("The total cost for the Socks before tax is "+totalSockCost$+ " and the tax is %.2f %n", sockTax$);
        //add '%n' so that it creates a new line, %.2 so it only has 2 places after decimal
        System.out.printf("The total cost for the Envelopes before tax is "+totalEnvelopeCost$+ " and the tax is %.2f %n", envelopeTax$);
        System.out.printf("The total cost for the Glasses before tax is "+totalGlassCost$+ " and the tax is %.2f %n", glassesTax$);
        System.out.printf("The total purchase cost before tax comes to %.2f %n", preTaxTotal$);
        System.out.printf("The total sale tax is %.2f %n", totalTax$);
        System.out.printf("The final total cost including tax is %.2f %n", totalTransCost$);
    }

        
    }
 