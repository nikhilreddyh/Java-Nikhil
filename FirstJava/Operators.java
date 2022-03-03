package FirstJava;

import java.util.*;

public class Operators {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.print("1.+ 2.- 3.* 4./ (choose one): ");
    int option = sc.nextInt();
    
    if(option==1) {
      System.out.println(num1+num2);
    } else if(option==2) {
      System.out.println(num1-num2);
    } else if(option==3) {
      System.out.println(num1*num2);
    } else if(option==4) {
      if(num2==0) System.out.println("divide by zero ERROR");
      else
        System.out.println(num1/num2);
    } else {
      System.out.println("1.+ 2.- 3.* 4./ (choose one): ");
    }

    sc.close();
  }
}
