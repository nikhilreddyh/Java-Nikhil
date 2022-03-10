package Methods.Assignment;

// Define a method to find out if a number is prime or not.

import java.util.*;
public class Prime {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    sc.close();

    if(isPrime(n)) System.out.println("prime");
    else System.out.println("not a prime");
  }

  static boolean isPrime(int n) {
    if(n<=1) return false;
    for(int i=2; i*i<=n; i++) {
      if(n%i == 0)  return false;
    }
    return true;
  }
}
