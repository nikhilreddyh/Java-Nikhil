// Factorial of a number

package FirstJava;

import java.util.*;

public class Factorial {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int p = 1;
    for(int i=num; i>1; i--) {
      p=p*i;
    }
    System.out.println("Factorial of "+num+" is "+p);

    sc.close();
  }
}
