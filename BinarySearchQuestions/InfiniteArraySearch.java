package BinarySearchQuestions;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArraySearch {
   public static void main(String[] args) {
     
    int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
    int target = 100;

    int start = 0;
    int end = 1;

    while(nums[end] < target) {
      int temp = end + 1;
      if((end + (end-start+1)*2) < nums.length)
        end = end + (end-start+1)*2;
      else end = nums.length-1;
      start = temp;
    }

    // System.out.println(start + " "+ end);
    System.out.println(search(nums, target, start, end));

   }

   static int search(int[] arr, int target, int start, int end) {

    while(start <= end) {
      int mid = (start) + (end - start) / 2;

      if(arr[mid] == target) return mid;
      else if(arr[mid] > target) end = mid - 1;
      else start = mid + 1;
    }

    return -1;
   }
}
