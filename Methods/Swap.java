package Methods;

import java.util.*;
public class Swap {
  public static void main(String[] args) {
    
    int a = 10;
    int b = 20;

    // a = a^b;
    // b = a^b;
    // a = a^b;

    swap(a,b);

    System.out.println(a+" "+b);

    String name = "kunal kushwaha";
    changeName(name);
    System.out.println(name);
  }

  static void changeName(String name) {
    name = "Rahul Rana";
  }
  
  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }
}
