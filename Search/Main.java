package Search;

// import java.util.*;   
public class Main {
  public static void main(String[] args) {
    
    int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
    int target = 190;
    int ans = linearSearch(nums, target);

    System.out.println(ans);

    System.out.println(linearSearch2(nums, target));
    System.out.println(linearSearch3(nums, target));

  }

  // search the target and return element itself
   static int linearSearch2(int[] arr, int target) {
     if(arr.length == 0) return Integer.MAX_VALUE;

     for(int ele:arr) {
       if(ele == target) return ele;
     }
     return Integer.MAX_VALUE;
   }

  // search the target and return true if found
   static boolean linearSearch3(int[] arr, int target) {
     if(arr.length == 0) return false;

     for(int ele:arr) {
       if(ele == target) return true;
     }
     return false;
   }

  // search in the array: return the index if item found
  // otherwise if item not found return -1
  static int linearSearch(int[] arr, int target) {
    if(arr.length == 0) {
      return -1;
    }

    for(int i=0; i<arr.length; i++) {
      if(arr[i] == target) return i;
    }
    return -1;

  }
}
