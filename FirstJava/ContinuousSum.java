// Take integer inputs till the user enters 0 and print the sum of all numbers.

package FirstJava;

import java.util.*;

public class ContinuousSum {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int sum = 0;

    int num = sc.nextInt();
    while(num!=0) {
      sum=sum+num;
      num = sc.nextInt();
    }
    System.out.println("Total sum is "+sum);

    sc.close();
  }
}
