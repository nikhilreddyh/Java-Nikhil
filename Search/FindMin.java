package Search;

public class FindMin {
  public static void main(String[] args) {
    
    int[] arr = {18, 12, 7, 3, 14, 28};
    // int[] arr = {};
    System.out.println(min(arr));
  }

  static int min(int[] arr) {

    // assume arr.length != 0
    // return the minimum value in the array
    int m = arr[0];
    for(int i=1; i<arr.length; i++) {
      if(arr[i] < m) m = arr[i];
    }
    return m;
  }
}
