package FirstJava;
import java.util.*;

public class SimpleInterest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double p = sc.nextDouble();
    double t = sc.nextDouble();
    double r = sc.nextDouble();

    System.out.println(p*t*r/100);

    sc.close();
  }
}
