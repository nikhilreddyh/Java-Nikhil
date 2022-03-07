package ConditionalsLoops.Intermediate;

// Armstrong Number In Java

import java.util.*;
public class ArmstrongNumbers {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = 0;
    int temp = n;

    while(temp>0) {
      sum += Math.pow(temp%10,3);
      temp /= 10;
    }

    if(sum == n) {
      System.out.println("Armstong Number");
    } else {
      System.out.println("Not a Armstrong Number");
    }

    sc.close();
  }
}
