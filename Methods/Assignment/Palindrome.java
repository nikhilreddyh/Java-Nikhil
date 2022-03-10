package Methods.Assignment;

// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    if(isPalindrome(sc.nextInt())) {
        System.out.println("palindrome");
    } else {
      System.out.println("not a palindrome");
    }

    sc.close();
  }

  static boolean isPalindrome(int n) {
    String str = Integer.toString(n);

    for(int i=0; i<str.length(); i++) {
      if(str.charAt(i) != str.charAt(str.length()-1-i)) {
        return false;
      }
    }
    return true;

  }
}
