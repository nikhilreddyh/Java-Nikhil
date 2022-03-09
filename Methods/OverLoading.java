package Methods;

public class OverLoading {
  public static void main(String[] args) {
    
    // at compile time only it decides which function to run
    // fun(67);
    fun("kunal");

    System.out.println(sum(3,4,78));
  }

  static int sum(int a, int b) {
    return a+b;
  }

  static int sum(int a, int b,int c) {
    return a+b+c;
  }

  static void fun(int a) {
    System.out.println("first one : ");
    System.out.println(a);
  }

  static void fun(String name) {
    System.out.println("second one : ");
    System.err.println(name);
  }
}
