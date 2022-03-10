package Methods.Assignment;

// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.*;
public class SumOfTwoNum {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    sc.close();

    sum(a,b);

  }
  
  static void sum(int a, int b) {
    System.out.println(a+b);
  }
}
