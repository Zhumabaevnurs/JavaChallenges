/*
18. Word Game

Write a program that plays a word game with the user. The program should ask the user to enter the following:
-> His or her name
-> His or her age
-> The name of a city
-> The name of a college
-> A profession
-> A type of  animal
-> A pet's name

After the user has enterred these items, the program should display the follwing story,
inserting the user's input into the appropriate locations:

There once was a person named NAME who lived in the CITY. At the age of AGE,
NAME went to college at COLLEGE. NAME graduated and went to work as a PROFESSION.
Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived happily ever after.
*/

import javax.swing.JOptionPane;

public class WordGame{
  public static void main(String[] args){
    String name, age, city, college, profession, animal, petName;
    int agE;

    name = JOptionPane.showInputDialog("Please enter your name: ");
    age = JOptionPane.showInputDialog("Please enter your age: ");
    agE = Integer.parseInt(age);
    city = JOptionPane.showInputDialog("Please enter the name of city where you live: ");
    college = JOptionPane.showInputDialog("Please enter your college: ");
    profession = JOptionPane.showInputDialog("What is your profession: ");
    animal = JOptionPane.showInputDialog("Please enter a type of animal: ");
    petName= JOptionPane.showInputDialog("Please enter your pet's name: ");

    JOptionPane.showMessageDialog(null,"There once was a person named "+name+" who lived in the "+city+". At the age of "+agE+", "
                                  + name+ " went to college at "+college+". "+name+" graduated and went to work as a "+profession
                                  + ". Then, "+name+" adopted a(n) "+animal+" named "+ petName+". They both lived happily and ever afeter.");

  }
}
