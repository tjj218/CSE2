//Tamara Johnson
//CSE 002 310
//Lab 02 - Create a bicycle cyclometer
//9/4/2015
// define class
public class Cyclometer{
    //  add main method
    public static void main(String[] args) {
        
        int trip1Secs= 480; //variable to track the seconds for 1st trip
        int trip1counts= 1561; //variable to track the rotations made during 1st trip
        int trip2Secs= 3220; //variable to track the seconds for second trip
        int trip2counts=9037; //variable to track the rotations made during second trip
        double wheelDiameter= 27.0, //CONSTANT Variable to keep wheel diameter
        PI= 3.14159, //Variable to hold the meaning of Pi
        feetPerMile=5280, //variable for how many feet in a mile
        inchesPerFoot=12, //variable for how many inches per foot
        secondsPerMinute=60; //variable for how many seconds per min
        double distanceTrip1, distanceTrip2, totalDistance; // create variables for the distance of the trips
        
        //Print out how long the trip took and how many rotations you had
        System.out.println("Trip 1 took " + (trip1Secs/secondsPerMinute) + " minutes and had " + trip1counts + " counts");
        System.out.println("Trip 2 took " + (trip2Secs/secondsPerMinute) + " minutes and had " + trip2counts + " counts");
        
        distanceTrip1= trip1counts*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Gives distance in miles
        distanceTrip2=trip2counts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance= distanceTrip2+distanceTrip1;
        
        //Print out the outputs
        System.out.println("Trip 1 was " + distanceTrip1+" miles");
         System.out.println("Trip 2 was " + distanceTrip2+" miles");
              System.out.println("The total distance was "+ totalDistance + " miles");
        
        
} //end of main method
} //end of class