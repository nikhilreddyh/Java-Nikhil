import java.util.*;
public class Demo {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    if(isEven(sc.nextInt()) == 0) System.out.println("Even");
    else System.out.println("Odd");
    

    sc.close();
    
  }

  static int isEven(int n) {
    return (n & 1);
  }
}