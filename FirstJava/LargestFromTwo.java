package FirstJava;

import java.util.*;

public class LargestFromTwo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    if(num1>num2) {
      System.out.println("Largest num is "+num1);
    } else {
      System.out.println("Largest num is "+num2);
    }

    sc.close();
  }
}
