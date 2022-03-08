package ConditionalsLoops.Intermediate;

// Sum Of A Digits Of Number
import java.util.*;
public class SumOfDigits {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    while(n>0) {
      sum += n%10;
      n /= 10;
    }

    System.out.println("sum of digits of "+temp+" is "+sum);

    sc.close();
  }
}
