/*
Chapter 2 Programming Challenges
15. Stock Commision

Kathryn bought 600 shares of stock at a price pf 21.77$ per share. She must pay her stackbroker a 2 percent commission for the
transaction. Write a program that calculates and displays the following:
->The amount paid for the stock alone(without the commission)
->The amount of the commission
->The total amount paid(for the stock plus the commission
*/
import javax.swing.JOptionPane;

public class StockCommission{
  public static void main(String[] args){
    //declare variables
    double stockTotal = 21.77*600;
    double stockCommission = 0.02 * stockTotal;
    double totalAmount = stockTotal + stockCommission;

    //display details
    JOptionPane.showMessageDialog(null,"Kathryn paid: "+stockTotal +" for the shares. She paid  "+stockCommission+" to her "
                                  +" stock broker paying a total of "+totalAmount);
    System.exit(0);
  }
}
