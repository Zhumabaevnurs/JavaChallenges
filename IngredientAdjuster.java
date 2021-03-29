/*
Chapter 2 Promgramming Challenges
17. Ingredient Adjuster

A cookie recipe calls  for the following ingredients:
-> 1.5 cups of sugar
-> 1 cup of butter
-> 2.75 cups of flour
The recipe produces 48 cookies with these amount of the ingredients. Write a program that asks the user how many cookie
he or she wants to make, and then display the numbe rof cups of each ingredient needed for the specified number of cookies.

sugar = 1500 gram
butter = 1000 gram
flour = 2750 gram

for 48 cookies we need 48 / 1500 = 0.032 of sugar
for 48 cookies we need 48 / 1000 = 0.048 of butter

*/

import java.util.Scanner;
public class IngredientAdjuster{
  public static void main(String[] args){
    //declare variables
    int userInput;
    double cupOfSugarFor48 = 1.5;
    double cupOfButterFor48 = 1;
    double cupOfFlourFor48 = 2.75;
    int regularBatchOfCookies = 48;

    double expectedCupsOfSugar;
    double expectedCupsOfButter;
    double expectedCupsOfFlour;

    //create a scanner
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the number of cookies ");
    userInput = keyboard.nextInt();

    expectedCupsOfSugar = ((double)userInput/ regularBatchOfCookies)*cupOfSugarFor48;
    expectedCupsOfButter = ((double)userInput/ regularBatchOfCookies)*cupOfButterFor48;
    expectedCupsOfFlour = ((double)userInput/ regularBatchOfCookies)*cupOfFlourFor48;

    //display information
    System.out.println("For "+ regularBatchOfCookies+" cookies, you will need "+expectedCupsOfSugar+" cups of sugar, "
                        + expectedCupsOfButter+" cups of butter and "+ expectedCupsOfFlour+" cups of flour.");

  }
}
