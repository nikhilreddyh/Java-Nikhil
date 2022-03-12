package Methods.Assignment;

// Write a function that returns all prime numbers between two given numbers.

// every composite number has a prime factor less than or equal to its square root.

import java.util.*;
public class PrimeNoRange {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int low = sc.nextInt();
    int upp = sc.nextInt();

    sc.close();

    for(int i=low; i<=upp; i++) {
      if(isPrime(i)) System.out.println(i);
    }
  }

  static boolean isPrime(int n) {
    if(n<=1) return false;
    for(int i=2; i*i<=n; i++) {
      if(n%i == 0) return false;
    }
    return true;
  }


}
