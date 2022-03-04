package ConditionalsLoops.Intermediate;

// Calculate Electricity Bill
import java.util.*;
public class ElectricityBill {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Units: ");
    float units = sc.nextFloat();

    System.out.print("Enter 1 unit value: ");
    float unitVal = sc.nextFloat();

    float bill = 0;

    if(units < 100) {
      bill = units * unitVal;
    }
    else if(units < 300) {
      bill = 100 * unitVal + (units - 100) * 2;
    }
    else if(units > 300) {
      bill = 100 * unitVal + 200 * 2 + (units - 300) * 3;
    }

    System.out.println("Bill : "+bill);


    sc.close();
  }
}
