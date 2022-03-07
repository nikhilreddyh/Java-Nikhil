package ConditionalsLoops.Intermediate;

// Power In Java
import java.util.*;
public class Power {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double base = sc.nextDouble();
    double exponent = sc.nextDouble();

    System.out.println(Math.pow(base,exponent));


    // works only if exponent >= 0(int only)

    // double ans = 1;
    // for(int i=1;  i<=exponent; i++) {
    //   ans = ans* base; 
    // }
    // System.out.println(ans);

    sc.close();

  }
}
