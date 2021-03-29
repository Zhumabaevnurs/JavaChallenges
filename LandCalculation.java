/*
Chapter2 programming Challenges
6. Land Calculation

One acre of land us equavalent to 43,560 square feet. write a program that calcilates the number of acres in
tract of land with  389,767 square feet. Hint: Divide the size of the tract of land by the size of an acre
to get the number of acres.

Gaddis, Tony (2015-05-29). Starting out with Java: From Control Structures through Objects (6th Edition, page 106).

*/

public class LandCalculation{
  public static void main(String[] args){
    final double One_Acre_Of_Land_Size = 43560;
    double Given_Track_Of_Land=389767;
    double Total_Size_Of_Tract;
    Total_Size_Of_Tract=Given_Track_Of_Land/One_Acre_Of_Land_Size;
    System.out.println("There is a number of acres: "+Total_Size_Of_Tract);
  }
}
