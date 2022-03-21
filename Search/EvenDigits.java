package Search;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
  public static void main(String[] args) {
    int[] arr = {12, 345, 2, 6, 7849};
    System.out.println(findNumbers(arr));

    System.out.println(even(-7685));
    System.out.println(even(0));
    System.out.println(digits2(768544));
    System.out.println(digits2(0));
  }

  static int findNumbers(int[] nums) {
    int  count = 0;

    for(int num:nums) {
      if(even(num)) count++;
    }

    return count;
  }

  static boolean even(int num) {
    int count = 0;
    // num = Math.abs(num);
    if(num<0) {
      num = num * -1;
    }
    if(num == 0) return false;
    while(num>0) {
      count ++;
      num /= 10;
    }
    return (count & 1) == 0;
  }

  static int digits2(int num) {
    if(num<0) {
      num = num * -1;
    }
    return (int)(Math.log10(num)) + 1;
  }
}
