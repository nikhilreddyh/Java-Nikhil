package ConditionalsLoops.Intermediate;

// Check Leap Year Or Not

import java.util.*;
public class LeapYear {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a year : ");
    int year = sc.nextInt();

    if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
      System.out.println("leap year");
    } else {
      System.out.println("not a leap year");
    }

    sc.close();
  }
}
