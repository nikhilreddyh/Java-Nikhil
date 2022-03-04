package ConditionalsLoops.Basics;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.*;

public class SumOfNum {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    while(true) {
      int n = sc.nextInt();
      if(n == 0) break;
      else sum += n;
    }

    System.out.println(sum);

    sc.close();
  }
}
