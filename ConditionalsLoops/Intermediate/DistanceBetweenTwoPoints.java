package ConditionalsLoops.Intermediate;

// Calculate Distance Between Two Points
import java.util.*;

public class DistanceBetweenTwoPoints {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double x1, y1, x2, y2;
    x1 = sc.nextDouble();
    y1 = sc.nextDouble();
    x2 = sc.nextDouble();
    y2 = sc.nextDouble();

    System.out.println(Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1)));

    // double ac = Math.abs(y2-y1);
    // double bc = Math.abs(x2-x1);

    // System.out.println(Math.hypot(ac, bc));

    sc.close();

  }
}
