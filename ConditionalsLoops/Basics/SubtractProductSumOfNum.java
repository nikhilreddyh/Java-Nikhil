package ConditionalsLoops.Basics;

import java.util.*;

public class SubtractProductSumOfNum {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    int sum = 0, product = 1;

    while(num>0) {
      sum += num%10;
      product *= num%10;
      num /= 10;
    }
    System.out.println(product - sum);

    sc.close();
  }
}
