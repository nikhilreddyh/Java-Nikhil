package ConditionalsLoops.Intermediate;

// Find if a number is palindrome or not
import java.util.*;

public class PalindromeNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String n = sc.next();

    boolean isPalindrome = true;
    for(int i=0; i<n.length()/2; i++) {
      if(n.charAt(i) != n.charAt(n.length()-1-i)) {
        isPalindrome = false;
        break;
      }
    }

    if(isPalindrome) {
      System.out.println("palindrome");
    } else {
      System.out.println("not a palindrome");
    }

    sc.close();
  }
}

