/*
Chapter 2 Programming Challenges
12. String Manipulator

Write a program that asks the user to enter the name of his or her favorite city. Use a String
variable to store the input. The program shouls display the following:
->The number of characters in the city name
->The name of the city in all uppercase letters
->The name of the city in all lowercase letters
->The fisrt characters in the name of the city

(6th Edition)(Page 107)
*/


import java.util.Scanner;

public class StringManipulator{
  public static void main(String[] args){;

     Scanner scanner = new Scanner(System.in);

     //declate variable
     String cityName;

     System.out.println("Please enter the name of your favorite city: ");
     cityName=scanner.nextLine();

     System.out.println("The number of charactes in "+cityName +" is "+cityName.length());
     System.out.println(cityName+" converted to uppper case is "+cityName.toUpperCase());
     System.out.println(cityName+" converted to lower case is "+cityName.toLowerCase());
     System.out.println(cityName.charAt(0));



  }
}
