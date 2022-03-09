package Methods;

import java.util.*;
public class Main {
  // static will refers to static only 

  public static void main(String[] args) {
    

    // int num1, num2, sum;

    // System.out.print("Enter number 1 : ");
    // num1 =sc.nextInt();
    // System.out.print("Enter number 2 : ");
    // num2= sc.nextInt();

    // sum = num1+num2;
    // System.out.println("sum : "+sum);

    // sum();
    // System.out.println(sum()); //error
    // System.out.println(sum2());

    int ans = sum3(20,10);
    System.out.println(ans);

  }

  static int sum2() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number 1 : ");
    int num1 =sc.nextInt();
    System.out.print("Enter number 2 : ");
    int num2= sc.nextInt();

    int sum = num1+num2;
    return sum;

    // unreachable code
    // System.out.println("This will never execute");

  }

  // pass the value of nmbers when you are calling the method in main()

  static int sum3(int a, int b) {
    return a+b;
  }

  static void sum() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number 1 : ");
    int num1 =sc.nextInt();
    System.out.print("Enter number 2 : ");
    int num2= sc.nextInt();

    int sum = num1+num2;
    System.out.println("sum : "+sum);

  }
  /*
    access modifier return type
  */
  
}
