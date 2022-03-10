package PrepInsta;

import java.util.*;
public class EvenOdd {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    if(isEven(sc.nextInt())) System.out.println("even");
    else System.out.println("odd");
    
  }

  static boolean isEven(int n) {
    return (n & 1) == 0;
  }
}
