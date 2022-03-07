package ConditionalsLoops.Intermediate;

// Future Investment Value
// futureVal = presentVal*[(1+rate/100)^years]

import java.util.*;
public class FutureInvestmentValue {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter present val : ");
    float presentVal = sc.nextFloat();
    System.out.print("Enter rate : ");
    float rate = sc.nextFloat();
    System.out.print("Enter years : ");
    float years = sc.nextFloat();

    System.out.println("Future Invesment Value : "+ presentVal*(Math.pow((1+rate/100),years)));

    sc.close();
  }
}
