package ConditionalsLoops.Intermediate;

// HCF Of Two Numbers Program

import java.util.*;

public class HCF {
  
  // solution 2
  static int gcd2(int a, int b) {

    // Everthing divides 0
    if(a == 0) return b;
    if(b == 0) return a;

    // base case
    if(a == b) return a;

    // recursion case
    if(a > b) return gcd2(a-b,b);
    return gcd2(a,b-a);

  }


  // solution 3
  static int gcd3(int a, int b) {

    // base case
    if(b == 0) return a;
    return gcd3(b,a%b);

  }


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    // solution 1
    // int low = a>b?a:b;

    // for(int i=low; i>0; i--) {
    //   if(a%i==0 && b%i==0) {
    //     System.out.println(i);
    //     break;
    //   }
    // }

    
    // solution 2
    // Euclidean algorithm
    // The idea is, GCD of two numbers doesn’t change if smaller number is subtracted from a bigger number.
    System.out.println(gcd2(a,b));

    // solution 3
    // A more efficient solution is to use modulo operator in Euclidean algorithm.
    System.out.println(gcd3(a,b));
    

    sc.close();
  }
  
}


