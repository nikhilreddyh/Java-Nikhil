package ConditionalsLoops.Switch;

import java.util.*;
public class NestedSwitch {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int empID = sc.nextInt();
    String dept = sc.next();

    switch(empID) {
      case 1:
        System.out.println("Kunal Kushwaha");
        break;
      case 2:
        System.out.println("Rahul Rana");
        break;
      case 3:
        System.out.println("Emp Number 3");
        switch(dept) {
          case "IT":
            System.out.println("IT Department");
            break;
          case "Management":
            System.out.println("Management Department");
            break;
          default:
          System.out.println("No department entered");
        }
        break;
      default:
        System.out.println("Enter valid empID");
    }

    sc.close();
  }
}
