package FirstJava;

import java.util.*;

public class RupeeToUSD {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int rupee = sc.nextInt();

    float usd = rupee*0.013f;

    System.out.println(rupee+" rupee is equal to "+usd+" USD");

    sc.close();
  }
}
