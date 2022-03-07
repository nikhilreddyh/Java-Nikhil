package ConditionalsLoops.Intermediate;

// Calculate Depreciation of Value
// formula V2 = V1[1-r/100]^T 

import java.util.*;
public class DepreciationOfValue {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // if time value is int (ex: time = 2 yrs)
    float initialVal = sc.nextFloat();
    float depreciation = sc.nextFloat();
    int time = sc.nextInt();

    for(int i=0; i<time; i++) {
      initialVal = (100-depreciation)/100*initialVal;
    }

    System.out.println("Depreciation value : "+initialVal);

    // if time value is float (ex: time = 2.5 yrs)
    // float initialVal = sc.nextFloat();
    // float depreciation = sc.nextFloat();
    // float time = sc.nextFloat();

    // float currentVal = (float)(initialVal*Math.pow((1-depreciation/100),time));
    // System.out.println("Depreciation value : "+currentVal);

    sc.close();
  }
}
