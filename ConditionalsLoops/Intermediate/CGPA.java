package ConditionalsLoops.Intermediate;

import java.util.*;

public class CGPA {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 subjects CGPA");
    System.out.print("sub1 : ");
    float sub1 = sc.nextFloat();
    System.out.print("sub2 : ");
    float sub2 = sc.nextFloat();
    System.out.print("sub3 : ");
    float sub3 = sc.nextFloat();
    System.out.print("sub4 : ");
    float sub4 = sc.nextFloat();
    System.out.print("sub5 : ");
    float sub5 = sc.nextFloat();

    float avg = (sub1+sub2+sub3+sub4+sub5) / 5.0f;
    System.out.println("CGPA : "+avg);
    System.out.println("CGPA percentage : "+avg*9.5);

    // After learning ARRAYS implement these using arrays :)

    sc.close();
    
  }
}
