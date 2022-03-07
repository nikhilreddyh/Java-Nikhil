package ConditionalsLoops.Intermediate;

// Calculate Depreciation of Value
// formula V2 = V1[1-r/100]^T 

import java.util.*;
public class DepreciationOfValue {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float initialVal = sc.nextFloat();
    float depreciation = sc.nextFloat();
    float time = sc.nextFloat();

    float currentVal = (float)(initialVal*Math.pow((1-depreciation/100),time));

    System.out.println("Depreciation value : "+currentVal);
  }
}
