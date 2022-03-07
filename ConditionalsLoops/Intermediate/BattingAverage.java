package ConditionalsLoops.Intermediate;

// formula : Batting avg = (total runs scored)/no.of dismisals

// Calculate Batting Average
import java.util.*;
public class BattingAverage {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int totalScore = sc.nextInt();
    int innings = sc.nextInt();
    int notOut = sc.nextInt();

    System.out.println("Batting Avg : "+(float)(totalScore)/(innings-notOut));

    sc.close();
  }
}
