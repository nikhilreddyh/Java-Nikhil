package ConditionalsLoops.Intermediate;

// Compound Interest Java Program

import java.util.*;

public class CompoundInterest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter principle amount : ");
    float p = sc.nextFloat();

    System.out.print("Enter Rate : ");
    float r = sc.nextFloat();

    System.out.print("Enter time : ");
    float t = sc.nextFloat();

    System.out.println(p*(Math.pow((1+r/100),t)));

    sc.close();
  }
}
