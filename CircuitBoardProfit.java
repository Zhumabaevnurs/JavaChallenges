/*
Chapter 2 Programming challenges

11. Circuit Board Profit

An electronics company sells circuit board at a 40 percent profit. If you know the retail price of a circuit board, you can
calculate its profit with the following formula: Profit = Retail price * 0.4
Write a progra that asks the user for the retail price of a circuit board, calculate the amount of profit earned for the product,
and display the results on the screen

(6th Edition)(Page 107)
*/
import javax.swing.JOptionPane;

public class CircuitBoardProfit{
  public static void main(String[] args){
    //declare variables
    final double PROFIT_PERCENTAGE = 0.4;
    double userRetailPrice;
    double companyProfit;

    String userOutputString=JOptionPane.showInputDialog("Please enter the retail price of the product ");
    userRetailPrice=Double.parseDouble(userOutputString);

    companyProfit=PROFIT_PERCENTAGE * userRetailPrice;

    JOptionPane.showMessageDialog(null, "The profot earned on "+ userRetailPrice+" is "+companyProfit);
    System.exit(0);

  }
}
