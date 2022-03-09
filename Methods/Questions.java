package Methods;

import java.util.*;
public class Questions {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // System.out.println(isPrime(n));
    // System.out.println(isArmstrong(n));

    for(int i=1; i<=999; i++) {
      if(isArmstrong(i)) System.out.print(i+" ");
    }
  }

  // print all the 3 digit armstrong numbers
  static boolean isArmstrong(int n) {
    int original = n;
    int sum = 0;

    while(n>0) {
      int rem = n%10;
      sum += rem*rem*rem;
      n /= 10;
    }
    // if(original == sum) return true;
    // return false;
    return original == sum;
  }

  static boolean isPrime(int n) {
    if(n<=1) return false;

    int c = 2;
    while(c*c <= n) {
      if(n%c == 0) return false;
      c++;
    }

    return true;
  }

}
