package Search;

// https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
  public static void main(String[] args) {
    
    int[][] accounts = {{12,2,3},{9,1,6},{3,3,7}};
    int max = Integer.MIN_VALUE;

    for(int[] person:accounts) {
      int sum = 0;
      for(int account:person) {
        sum += account;
      }
      if(sum > max) {
        max = sum;
      }
    }

    System.out.println(max);
  }
}
