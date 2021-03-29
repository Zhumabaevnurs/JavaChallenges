/*
Chapter 2 Programming Challenges
3.Personal information

Write a program that displays the following inforamtion, each on a separate lie:
->Your name
->Your address, with city, state, and ZIP
->Your telephone numbers
->Your college major

Although these items should be displayed on separate output lines, use only a single println
statement in your program
*/

public class PersonalInformation{
  public static void main(String[] args){
    //declare variables
    String name="Nursultan Zhumabaev";
    String street = "1820 Ave V";
    String city="Brooklyn";
    String state="New York";
    String zip="11229";
    String major="Computer Science";
    System.out.println(name+"\n"+street+"\n"+city+"\n"+state+"\n"+zip+"\n"+zip+"\n"+major);




  }
}
