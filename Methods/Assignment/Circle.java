package Methods.Assignment;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.*;
public class Circle {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    float radius = sc.nextFloat();

    sc.close();

    System.out.println("Circumference : "+circumference(radius));
    System.out.println("Area : "+area(radius));
  }

  static double circumference(float r) {
    return 2*(Math.PI)*r;
  }

  static double area(float r) {
    return Math.PI*r*r;
  }
}
