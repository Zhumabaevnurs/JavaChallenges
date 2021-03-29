/*
Chapter 2 Programming Challenges
7. Sales Tax

Write program that will ask the user to enter the amount of a purchase. The program should then compute the state and country
sales tax. Assume that state sales tax is 4 percent and the coutry sales tax us 2 percent. The origram should display the amount of the
purchase, the state sales tax, the country sales tax, the total sales tax, and the total of the sale(which is the sum of the amount of
purchase plus the total sales tax).

Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent.

Gaddis, Tony(201.5-05-29).Starting Out with Java: From Control Structures through Objects (6th Edition)(Page 106). Pearson.
Kindle Edition.
*/
import javax.swing.JOptionPane;

public class SalesTax{
  public static void main(String[] args){
    String UserInput;
    double AmountOfPurchase;
    final double STATE_TAX = 0.02;
    final double COUNTRY_TAX = 0.04;
    double stateTax;
    double countryTax;
    double totalTax;
    double totalSale;
    UserInput = JOptionPane.showInputDialog("Please, enter the amount of a purchase: ");
    AmountOfPurchase = Double.parseDouble(UserInput);
    stateTax = AmountOfPurchase*STATE_TAX;
    countryTax= AmountOfPurchase*COUNTRY_TAX;
    totalTax= stateTax+countryTax;
    totalSale=AmountOfPurchase+totalTax;

    JOptionPane.showMessageDialog(null, "Purchase amount: "+AmountOfPurchase+"\nState Tax: "+stateTax+"\nCountry Tax: "+countryTax+"\nTotal Tax: "+totalTax+"\n Total Sale: "+totalSale);
    System.exit(0);

  }
}
