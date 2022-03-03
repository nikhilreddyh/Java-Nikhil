package FirstJava;

import java.util.*;

public class RupeeToUSD {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double rupee = sc.nextInt();

    double usd = rupee*0.013;

    System.out.println(rupee+" rupee is equal to "+usd+" USD");

    sc.close();
  }
}
