package Methods.Assignment;

// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below

import java.util.*;

public class Grade {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks (out of 100) : ");
    int marks = sc.nextInt();
    
    sc.close();

    printGrade(marks);


  } 
  
  static void printGrade(int n) {
    if(n>=91 && n<=100) System.out.println("AA");
    else if(n>=81 && n<=90) System.out.println("AB");
    else if(n>=71 && n<=80) System.out.println("BB");
    else if(n>=61 && n<=70) System.out.println("BC");
    else if(n>=51 && n<=60) System.out.println("CD");
    else if(n>=41 && n<=50) System.out.println("DD");
    else if(n<=40) System.out.println("Fail");
    else System.out.println("Invalid");

  }
}
