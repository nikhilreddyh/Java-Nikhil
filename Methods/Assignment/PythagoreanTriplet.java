package Methods.Assignment;

// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.*;

public class PythagoreanTriplet {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    sc.close();
    System.out.println(isPythagoreanTriplet(arr));
    System.out.println(isPythagoreanTriplet2(arr));
  }

  // O(n^3)
  static boolean isPythagoreanTriplet(int[] arr) {

    for(int i=0; i<arr.length; i++) {
      for(int j=i+1; j<arr.length; j++) {
        for(int k=j+1; k<arr.length; k++) {
          int x = arr[i]*arr[i], y = arr[j]*arr[j], z = arr[k]*arr[k];

          if(x == y+z || y == x+z || z == x+y) {
            return true;
          }
        }
      }
    }
    return false;
  }

  // O(n^2)
  static boolean isPythagoreanTriplet2(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      arr[i] = arr[i]*arr[i];
    }
    Arrays.sort(arr);

    for(int i=arr.length-1; i>=2; i--) {
      int l = 0;
      int r = i-1;

      while(l<r) {
        if(arr[i] == arr[l]+arr[r]) {
          return true;
        }
        else if(arr[i] > arr[l]+arr[r]) {
          l++;
        }
        else {
          r--;
        }
      }

    }

    return false;
  }


}
