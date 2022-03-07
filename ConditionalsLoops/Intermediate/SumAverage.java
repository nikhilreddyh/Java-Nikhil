package ConditionalsLoops.Intermediate;

// Calculate Average Marks
// Sum of N numbers
import java.util.*;
public class SumAverage {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int sum = 0;

    for(int i=0; i<n; i++) {
      sum += sc.nextInt();
    }
    System.out.println("sum : "+sum);
    System.out.println("avg : "+sum/(float)(n));

    sc.close();
  }
}
