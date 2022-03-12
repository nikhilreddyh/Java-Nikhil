package Arrays;

import java.util.*;
public class Max {
  public static void main(String[] args) {
    
    int[] arr = {1,3,23,9,18};
    // System.out.println(max(arr,3,4));

    System.out.println(Arrays.toString(arr));
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  }

  static int max(int[] arr, int startIndex, int endIndex) {
    if(endIndex>startIndex) return -1;
    if(arr == null) return -1;
    if(arr.length == 0) return -1;

    int m = arr[startIndex];

    for(int i=startIndex; i<=endIndex; i++) {
      if(arr[i]>m) m = arr[i];
    }
    return m;
  }

  static void reverse(int[] arr) {
    for(int i=0; i<arr.length/2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i] = temp;
    }
  }

}
