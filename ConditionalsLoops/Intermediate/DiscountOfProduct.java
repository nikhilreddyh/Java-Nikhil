package ConditionalsLoops.Intermediate;

import java.util.*;

// Calculate Discount Of Product

public class DiscountOfProduct {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter marked price :");
    int markedPrice = sc.nextInt();

    System.out.print("Enter discount percentage :");
    float discount = sc.nextFloat();

    System.out.println("Amount to be paid : "+(100-discount)/100*markedPrice);

    sc.close();
  }
}
