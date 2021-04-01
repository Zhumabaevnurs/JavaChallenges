/*
Chapter 3 Programming challenges

Write the origram that promts the user to enter a number within the range of 1 through 10. The program should display
the Roman numeral version of that number. If the number is outsite the range of 1 through 10, the program should display
an error message.
*/
import java.util.Scanner;
public class RomanNumerals {
  public static void main(String[] args){
    //Create a scanner object
    Scanner keyboard = new Scanner(System.in);

    //declate variable
    int userNumber;

    //Promt user for input
    System.out.println("Please enter a number from 1 to 10: ");
    userNumber = keyboard.nextInt();

    if     (userNumber == 10)System.out.println(userNumber+" in roman numerals is X");
    else if(userNumber == 1) System.out.println(userNumber+" in roman numerals is I ");
    else if(userNumber == 2) System.out.println(userNumber+" in roman numerals is II ");
    else if(userNumber == 3) System.out.println(userNumber+" in roman numerals is III ");
    else if(userNumber == 4) System.out.println(userNumber+" in roman numerals is IV ");
    else if(userNumber == 5) System.out.println(userNumber+" in roman numerals is I ");
    else if(userNumber == 6) System.out.println(userNumber+" in roman numerals is VI ");
    else if(userNumber == 7) System.out.println(userNumber+" in roman numerals is VII ");
    else if(userNumber == 8) System.out.println(userNumber+" in roman numerals is VIII ");
    else if(userNumber == 9) System.out.println(userNumber+" in roman numerals is IX ");
    else System.out.println("Please run the program and enter a number from 1 to 10: ");
  }
}
