package Methods.Assignment;

// Define a method that returns the product of two numbers entered by user.

import java.util.*;
public class ProductOfTwoNum {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    sc.close();

    product(a, b);

  }

  static void product(int a, int b) {
    System.out.println(a*b);
  }
}
