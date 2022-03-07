package ConditionalsLoops.Intermediate;

// Calculate Commission Percentage
import java.util.*;
public class CommissionPercentage {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter amount : ");
    float amount = sc.nextFloat();
    System.out.print("Enter commission percentage : ");
    float commission = sc.nextFloat();

    System.out.println("Your Commission : "+commission/100*amount);

    sc.close();
  }
}
