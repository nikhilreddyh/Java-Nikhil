package Methods.Assignment;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.*;
public class MaxMin {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println("Max :"+maximum(a,b,c));
    System.out.println("Min :"+minimum(a,b,c));
    // System.out.println(max(a,b,c));

    sc.close();

  }

  static int max(int a, int b, int c) {
    if(a > b) {
      if(a > c) return a;
      return c;
    }
    else if(b>c) return b;
    return c;
  }

  static int maximum(int a, int b, int c) {
    int max = a;
    if(b>max) max = b;
    if(c>max) max = c;

    return max;
  }

  static int minimum(int a, int b, int c) {
    int min = a;
    if(b<min) min = b;
    if(c<min) min = c;

    return min;
  }

}
