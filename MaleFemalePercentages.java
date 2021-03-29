/*
Chapter 2 Programming challenges

14.  Male and Female percentages

Write a program that asks the user for the number of males and the number of females registered in a class.
 The program should display the percentage of males nad females in the class. Hint: Suppose there are 8 males
 and 12 females in a class. There are 20 students in the class. The percentage of males can be calculated as
 8/20=0.4, or 40%. The percentage of females can be calculated as 12/20 = 0.6, 60%.

*/
import javax.swing.JOptionPane;

public class MaleFemalePercentages{
  public static void main(String[] args){
    String Male, Female;
    int male, female;
    int total;

    Male = JOptionPane.showInputDialog("Please, enter the number of male student: ");
    male = Integer.parseInt(Male);
    Female = JOptionPane.showInputDialog("Please, enter the number of female student: ");
    female = Integer.parseInt(Female);
    total = male+female;

    male=male/total*100;
    female = female/total*100;

    JOptionPane.showMessageDialog(null,"The total students of class is "+total+"$. \nThe percentage of male student: "+male+"$ \nThe percentage of female students: "+female);
    System.exit(0);

  }
}
