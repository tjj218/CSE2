//Tamara Julia Johnson
//CSE 002 310
//Lab 13- rectangle
//11/19/2015
// Create a program that gives you practice writing and  manipulating non static methods

//import scanner class
import java.util.Scanner;
//define class
public class Rectangle{
    //declare non static global variables
    double width;
    double height;
    //write non static methods
    public void setWidth(double x){
        width = x;
    }
    public void setHeight(double y){
        height = y;
    }
    //write method to calculate and return the area
    public double getArea(){
        double area = width*height;
        return area;
    }
    //write main method
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.setHeight(5.3);
        r1.setWidth(7.3);
        //print out the answer
        System.out.println(r1.getArea());
    }
}