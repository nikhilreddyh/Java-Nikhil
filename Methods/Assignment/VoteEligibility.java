package Methods.Assignment;

// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.*;
public class VoteEligibility {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(isEligibleToVote(age)) {
      System.out.println("eligible");
    } else {
      System.out.println("not eligible");
    }

    sc.close();
  }

  static boolean isEligibleToVote(int age) {
    return age >= 18;
  }
}
