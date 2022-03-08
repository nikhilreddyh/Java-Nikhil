package ConditionalsLoops.Intermediate;

// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

import java.util.*;
public class EvenDaysCount {
  public static void main(String[] args) {

    int count = 0;
    // solution 1
    for(int i=1; i<=31; i++) {
      if(i%2 == 0) count++;
    }

    // solution 2
    // for(int i=2; i<=31; i=i+2) count++;

    System.out.println(count+" days");

    
  }
}
