/*
1.Name, age , and annual income

Write a program that declares the following
-> a String variable named name
-> a int variable named age
-> a double variable named annualPay
Store your age, name, and desired annual income as literals in there variables.
The program should display these values on the screen in a manner similar to the following:
My name is Nursultan Zhumabaev, my age is 26 and
I hope to earn 150000.0$ per year.

*/
import javax.swing.JOptionPane;

public class AnnualIncome{
  public static void main(String[] args){
    String name;
    int age;
    double annualPay;

    name=JOptionPane.showInputDialog("Please enter your name: ");
    age=Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));
    annualPay= Double.parseDouble(JOptionPane.showInputDialog("Please enter your desired annual income: "));

    JOptionPane.showMessageDialog(null, "My name is "+name+", my age is "+ age+" and I hope to earn $"+annualPay+" per year");

  }
}
