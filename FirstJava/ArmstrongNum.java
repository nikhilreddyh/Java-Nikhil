package FirstJava;

import java.util.*;


public class ArmstrongNum {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int lower = sc.nextInt();
    int upper = sc.nextInt();

    for(int num=lower; num<=upper; num++) {
      int temp = num;
      int sum = 0;
      while(temp!=0) {
        sum = sum+(int)(Math.pow(temp%10, 3));
        temp = temp/10;
      }
      if(sum==num) System.out.println(num);

  }
    sc.close();
  }
}
