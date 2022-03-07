package ConditionalsLoops.Intermediate;

import java.util.*;

// Reverse A String In Java
// Strings are immutable

public class ReversedString {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    String result = "";

    for(int i=str.length()-1; i>=0 ; i--) {
      result += str.charAt(i);
    }
    System.out.println(result);

    sc.close(); 
  }  
}
