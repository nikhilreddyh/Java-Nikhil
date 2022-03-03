package FirstJava;

import java.util.*;

public class Greetings {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("please input a name : ");
    String name = sc.nextLine();

    System.out.println("Hey "+name);

    sc.close();
  }
}
