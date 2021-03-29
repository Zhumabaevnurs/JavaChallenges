/*
Chapter 2 programming challenges
9. Miles-per-gallon

A car's miles-per-gallon (MPG) can be calculates with the following formula:
MPG - Miles driven / Gallons of gas used. Write a program that asks the user for the number of miles driven and the gallons of gas
used. It should calculate the car's miles-per-gallon and display the result on the screen.
(6th Edition)(Page 7)
*/
import java.util.Scanner;
public class MilesPerGallon{
  public static void main(String[] args){
    //declare variables
    double userMiles;
    double userGallons;
    double MilesPerGalon;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the miles: ");
    userMiles=scanner.nextDouble();

    System.out.println("Please enter the gallons of gas used: ");
    userGallons = scanner.nextDouble();

    MilesPerGalon=userMiles/userGallons;

    System.out.println("Miles per gallon is "+MilesPerGalon);



  }
}
