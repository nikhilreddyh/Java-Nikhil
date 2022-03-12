package Methods.Assignment;

// Write a function that returns the sum of first n natural numbers.

import java.util.*;
public class SumOfNNumbers {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(sum(n));

    sc.close();
  }

  static int sum(int n) {
    // solution 1
    // int sum = 0;
    // for(int  i=0; i<=n; i++) sum += i;
    // return sum;

    // solution 2
    // The above program causes overflow, even if the result is not beyond the integer limit. We can avoid overflow up to some extent by dividing first.
 
    // return n*(n+1)/2;

    // solution 3
    if(n%2 ==0) return n/2*(n+1);
    else return (n+1)/2*n;
  }

}
