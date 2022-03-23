package BinarySearchQuestions;

public class flooring {
  public static void main(String[] args) {
    
    int[] nums = {2,3,5,9,14,16,18};
    int target = 1; 

    System.out.println(flooring1(nums, target));
    // System.out.println(flooring2(nums, target)); 

  }

  // return greatest number <= target
  static int flooring1(int[] arr, int target) {

    if(arr[0] > target) return -1;
    int start = 0;
    int end = arr.length -1 ;

    while(start <= end) {

      int mid = start + (end - start) / 2;
      if(arr[mid] == target) return arr[mid];
      else if(arr[mid] > target) end = mid - 1;
      else start = mid + 1;
    }

    return arr[end];
  }

  // running infinity incase of 4;
  // static int flooring2(int[] arr, int target) {
    
  //   int start = 0;
  //   int end = arr.length - 1;

  //   while(start < end) {
  //     int mid = (start) + (end - start) / 2;

  //     if(arr[mid] == target) return arr[mid];
  //     else if(arr[mid] > target) end = mid - 1;
  //     else start = mid; 
  //   }

  //   return arr[start];
  // }

}
