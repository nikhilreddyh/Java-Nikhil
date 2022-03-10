package Methods.Assignment;

// Define a program to find out whether a given number is even or odd.

import java.util.*;
public class EvenOdd {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(isEven(n)) System.out.println("even");
    else System.out.println("odd");

    if(isEven1(n)) System.out.println("even");
    else System.out.println("odd");

    if(isEven2(n)) System.out.println("even");
    else System.out.println("odd");

    if(isEven3(n)) System.out.println("even");
    else System.out.println("odd");

    if(isEven4(n)) System.out.println("even");
    else System.out.println("odd");

    sc.close();

  }

  // Brute Force Naive Approach
  static boolean isEven(int n) {
    return n%2 == 0;
  }

  // Using Bitwise OR
  static boolean isEven1(int n) {
    return (n | 1) > n;
  }

  // using Bitwise AND
  static boolean isEven2(int n) {
    return (n & 1) == 0;
  }

  // using Bitwise XOR
  static boolean isEven3(int n) {
    return (n ^ 1) > n;
  }

  // checking the LSB of a number
  static boolean isEven4(int n) {
    return Integer.toBinaryString(n).endsWith("0");
  }
}
