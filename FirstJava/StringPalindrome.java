package FirstJava;

import java.util.*;

public class StringPalindrome {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    boolean isPalindrome = true;

    for(int i=0; i<=str.length()/2; i++) {
      if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
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
