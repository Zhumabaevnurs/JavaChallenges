/*
Chapter 2 Programming challenges

10. Test  average

Write a program that asks the user to enter three test scores. The program should display each test score, as well as the average of the scores.
(6th Edition) (page 107)
*/
import javax.swing.JOptionPane;
public class TestAverage{
  public static void main(String[] args){
    String test1, test2, test3;
    double testOne, testTwo, testThree;
    double testAverage;

    test1 = JOptionPane.showInputDialog("Please, enter the test one: ");
    testOne = Double.parseDouble(test1);
    test2 = JOptionPane.showInputDialog("Please, enter the test two: ");
    testTwo = Double.parseDouble(test2);
    test3 = JOptionPane.showInputDialog("Please, enter the test three: ");
    testThree = Double.parseDouble(test3);

    testAverage = (testOne+testTwo+testThree)/3;

    JOptionPane.showMessageDialog(null, "The the average is "+testAverage);

    System.exit(0);




  }
}
