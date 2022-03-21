package Search;

import java.util.*;
public class SearchIn2DArray {
  public static void main(String[] args) {
    
    int[][] arr = {
      {23, 4, 1},
      {18, 12, 3, 9},
      {78, 99, 34, 56},
      {18, 12}
    };

    int target = 56;
    int[] ans = search(arr, target);  
    System.out.println(Arrays.toString(ans));

    System.out.println(max(arr, target));
    System.out.println(min(arr, target));

    System.out.println(Integer.MIN_VALUE);

  }

  static int[] search(int[][] arr, int target) {
    if(arr.length == 0) return new int[] {-1, -1};
    
    for(int i=0; i<arr.length; i++) {
      for(int j=0; j<arr[i].length; j++) {
        if(arr[i][j] == target) return new int[] {i,j};
      }
    }

    return new int[] {-1, -1};

  }

  static int max(int[][] arr, int target) {
    int max = arr[0][0];
    for(int[] i:arr) {
      for(int j:i) {
        if(j > max) max = j;
      }
    }
    return max;
  }
    
  static int min(int[][] arr, int target) {
    int min = arr[0][0];
    for(int[] i:arr) {
      for(int j:i) {
        if(j < min) min = j;
      }
    }
    return min;
  }

}
