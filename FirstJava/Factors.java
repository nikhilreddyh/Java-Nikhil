// To print all the factors of a number.

package FirstJava;

import java.util.*;

public class Factors {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for(int i=1; i<=num; i++) {
      if(num%i==0)
        System.out.println(i);
    }
  }
}
