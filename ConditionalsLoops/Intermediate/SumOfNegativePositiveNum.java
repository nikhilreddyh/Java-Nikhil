package ConditionalsLoops.Intermediate;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.*;
public class SumOfNegativePositiveNum {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int positiveEvenNoSum = 0;
    int positiveOddNoSum = 0;
    int negativeSum = 0;

    int num;
    while(true) {
      num = sc.nextInt();
      if(num == 0) break;
      else if(num<0) negativeSum += num;
      else if(num>0 && num%2==0) positiveEvenNoSum += num;
      else if(num>0 && num%2!=0) positiveOddNoSum += num;
      
    }

    System.out.println("sum of -ve no : "+negativeSum);
    System.out.println("sum of +ve even no : "+positiveEvenNoSum);
    System.out.println("sum of +ve odd no : "+positiveOddNoSum);

    sc.close();
  }
}
