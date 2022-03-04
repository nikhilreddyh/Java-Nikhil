package ConditionalsLoops.Basics;

import java.util.*;

public class FibonacciSeries {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n value: ");
    int n = sc.nextInt();

    int a = 0, b = 1;
    System.out.print(a+" "+b+" ");
    
    for(int i=3; i<=n; i++) {
      int temp = a + b;
      System.out.print(temp+" ");
      a = b;
      b = temp;
    }

    sc.close();
  }
}
