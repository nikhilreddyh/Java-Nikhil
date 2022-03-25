package BinarySearchQuestions;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class Bitonic {
  public static void main(String[] args) {
    int[] arr = {0,2,4,6,8,9,10};
    System.out.println(mountainPeak(arr));
  }

  static int mountainPeak(int[] arr) {
    int start = 0;
    int end = arr.length-1;

    while(start < end) {
      int mid = start + (end - start) / 2;

      if(arr[mid] > arr[mid+1]) end = mid;
      else start = mid + 1;
    }
    return end;
  }

}
