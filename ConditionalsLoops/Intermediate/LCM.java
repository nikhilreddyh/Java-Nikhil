package ConditionalsLoops.Intermediate;

// LCM Of Two Numbers
import java.util.*;

public class LCM {
  // formula : a*b = lcm(a,b)*gcd(a,b)

  // solution 2
  // static int gcd(int a, int b) {
  //   // base case
  //   if(b == 0) return a;
  //   return gcd(b,a%b);
  // }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    // solution 1
    int max = (a>b)?a:b;
    System.out.println(max);
    int mul = max;

    while(true) {
      if((mul)%a ==0 && (mul)%b == 0) {
        System.out.println("LCM : "+mul);
        break;
      }
      // System.out.println(max);
      mul += max;
    }


    // solution 2
    // System.out.println("LCM : "+(a*b)/gcd(a,b));

    sc.close();

  }
}
