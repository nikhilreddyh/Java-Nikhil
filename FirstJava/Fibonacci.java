package FirstJava;

import java.util.*;

public class Fibonacci {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);

    int c = 0;
    for(int i=2; i<n; i++) {
      c = a+b;
      System.out.println(c);
      a=b;
      b=c;
    }

    sc.close();


  }
}
