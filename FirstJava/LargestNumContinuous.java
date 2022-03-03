// Take integer inputs till the user enters 0 and print the largest number from all.

package FirstJava;

import java.util.*;

public class LargestNumContinuous {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int max = Integer.MIN_VALUE;

    System.out.println("Enter a number(press 0 to QUIT)");
    int num = sc.nextInt();

    while(num!=0) {
      if(num>max) max=num;
      System.out.println("Enter a number(press 0 to QUIT)");
      num = sc.nextInt();
    }

    System.out.println("Largest of all is "+max);

    sc.close();
  }
}
