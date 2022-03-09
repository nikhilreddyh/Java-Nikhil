package Methods;

public class Scoping {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    String name = "kunal";
    
    {
      a = 100; // already initialised outside in the same method, hence you cannot initialise again, but we can modify
      System.out.println(a);
      int c = 99;
      // values initialised in this block, will remain in block

      name = "rahul";
      System.out.println(name);
    }
      // scoping in for loops
      for(int i=0; i<4; i++) {
        System.out.println(i);
        a = 10000;
      }
      System.out.println(a);

    System.out.println(a);
    // System.out.println(c); //cannot use outside the block
    System.out.println(name);

  }

  static void random(int marks) {
    int num = 97;
    System.out.println(num);
    System.out.println(marks);
  }
}
