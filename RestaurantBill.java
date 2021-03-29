/*
Chapter 2 Programming Challenges
13. Restaurant Bill

Write a program that computer the tax amd tip on a restaurant bill. The program should ask the user to enter the charge for the meal.
The tax should be 6.75 precent of the meal charge. The tip should be 20 percent of the total after adding the tax. Display the meal
charge, tax amount, tip amount, and total bill on the screen.

(6th edition) (page 107)
*/
import java.util.Scanner;
public class RestaurantBill{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    //declare variable
    final double TAX=0.0675;
    final double TIPS=0.20;
    double costOfTheMeal;
    double taxMeal;
    double tipsMeal;
    double total;

    System.out.println("Please enter the cost of the meal: ");
    costOfTheMeal=scanner.nextDouble();

    taxMeal= costOfTheMeal*TAX;
    tipsMeal=costOfTheMeal*TIPS;

    total=costOfTheMeal+taxMeal+tipsMeal;

    System.out.println("The cost of the meal is " +costOfTheMeal);
    System.out.println("The tax for meal is " +taxMeal);
    System.out.println("20% of tips for the meal is " +tipsMeal);
    System.out.println("The total cost of the meal is " +total);


  }
}
