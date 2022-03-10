package Methods.Assignment;

// Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n
import java.util.*;
public class Factorial {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    sc.close();

    System.out.println(factorial(n));

  }

  static int factorial(int n) {
    if(n<0) {
      System.out.println("Invalid");
      return 0;
    } 
    
    int p = 1;
    for(int i=n; i>=2; i--) {
      p *= i;
    }

    return p;
  }
}
