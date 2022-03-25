package BinarySearchQuestions;

public class SearchInMountain {
  public static void main(String[] args) {

    // int[] arr = {1,2,3,4,5,3,1};
    int[] arr = {0,1,2,4,2,1};
    int target = 3;

    int peak = peak(arr);

    int first = orderAgnosticBinarySearch(arr, target, 0, peak-1);
    if(first != 1) System.out.println(first);
    else System.out.println(orderAgnosticBinarySearch(arr, target, peak, arr.length-1));
  }

  static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
    boolean isAsc = arr[start] < arr[end];
    int index = -1;

    while(start <= end) {
      int mid = start + (end - start) / 2;

      if(arr[mid] == target) {
        index = mid;
        if(isAsc) end = mid - 1;
        else start = mid + 1;
      }
      else if(arr[mid] > target) end = mid - 1;
      else start = mid + 1;
    }

    return index;
  }

  static int peak(int[] arr) {
    int start = 0;
    int end = arr.length-1;

    while(start < end) {
      int mid = start + (end - start) / 2;

      if(arr[mid] > arr[mid + 1]) end = mid;
      else start = mid + 1;
    }

    return end;
  }

}
