/*
Chapter 2 programming Challenges

16. Energy Drink Consumption

A soft drink company recetly surveyed 12,467 of its customers and found that approximately 14 percent of those serveyed purchase
one or more energy drinks per week. Of those customers who purchase energy drink, approximatly 64 percent of them prefer
citrusflavored energy drink. Write a program that display the following:
-> The approximatly number of customers in the survey who purchase one or more energy drinks per week
-> The approximatly number of customers in the survey who prefer citrus-flavored energy drinks
*/

public class EnergyDrinkConsumption {
  public static void main(String[] args){
    //variables declaration
    int surveyedCustomers = 12467;
    double energyDrinkCustomers = 0.14*surveyedCustomers;
    double citrusFlavoiredCusotmers = 0.64*energyDrinkCustomers;

    System.out.println("out of "+ surveyedCustomers+" customers, "+(int)energyDrinkCustomers+" buy one or two energy "+
                       "drinks. And out of those, "+(int)citrusFlavoiredCusotmers+" prefer citrus flavored energy drinks");
  }
}
