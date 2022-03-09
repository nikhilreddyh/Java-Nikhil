package Methods;

public class PassingExample {
  public static void main(String[] args) {
    
    String name = "kunal kushwaha";
    greet(name);  //value of reference var is passed
    // pass by refernce
    System.out.println(name);

  }

  static void greet(String naam) {
    naam = "rahul"; //not changing, creating new object
  }

}
