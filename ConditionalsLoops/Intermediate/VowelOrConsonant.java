package ConditionalsLoops.Intermediate;

import java.util.*;
// Java Program Vowel Or Consonant


public class VowelOrConsonant {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char ch = sc.next().trim().toLowerCase().charAt(0);

    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.println("vowel");
    } else if(ch >= 'a' && ch <= 'z') {
      System.out.println("consonant");
    } else {
      System.out.println("Invalid : input only char's");
    }

    sc.close();
  }  
}
