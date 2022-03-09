package Methods;

import java.util.*;
public class Strings {
  public static void main(String[] args) {
    
    // String message = greet();
    // System.out.println(message);

    Scanner sc = new Scanner(System.in);
    String naam = sc.nextLine();

    String personalised = myGreet(naam);
    System.out.println(personalised);
  }

  static String myGreet(String name) {
    String message = "Hello "+name;
    return message;
  }

  static String greet() {

    String greeting = "how are you";
    return greeting;
  }
}
