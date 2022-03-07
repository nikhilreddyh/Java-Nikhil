package ConditionalsLoops.Intermediate;

// Find Ncr & Npr

import java.util.*;
public class NcrNpr {

  public static int fact(int n) {
    int p = 1;
    for(int i=n; i>1; i--) {
      p *= i;
    }
    return p;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    // n!/(n-r)!
    System.out.println("Npr : "+ fact(n)/fact(n-r));
    // n! / r!(n-r)!
    System.out.println("Ncr : "+ fact(n)/ (fact(r)*fact(n-r)));

    sc.close();
    
  }
}
