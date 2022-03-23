package BinarySearchQuestions;

public class ceiling {
  public static void main(String[] args) {
    
    int[] nums = {2, 3, 5, 9, 14, 16, 18};
    int target = 20;

    // System.out.println(ceilingValue(nums, target));
    System.out.println(ceilingValue2(nums, target));

  }

  // return smallest number >= target
  // static int ceilingValue(int[] arr, int target) {
  //   if(target > arr[arr.length-1]) return -1;
  //   int start = 0;
  //   int end = arr.length-1;
  //   // int max = target;

  //   while(start < end) {
  //     int mid = start + (end - start) / 2;

  //     if(arr[mid] == target) return arr[mid];
  //     else if(arr[mid] > target) {
  //       end = mid;
  //       // max = arr[mid];
  //     } else  {
  //       start = mid + 1 ;
  //     }
  //   }

  //   return arr[end];
  // }

  static int ceilingValue2(int[] arr, int target) {

    if(target > arr[arr.length-1]) return -1;
    
    int start = 0;
    int end = arr.length - 1;

    while(start <= end) {
      int mid = start + (end - start) / 2;

      if(arr[mid] == target) {
        return arr[mid];
      } else if(arr[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return arr[start];

  }

}
