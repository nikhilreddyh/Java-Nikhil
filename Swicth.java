import java.util.*;

public class Swicth {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // switch(n) {
    //   case 1:
    //     System.out.println("Monday"); break;
    //   case 2:
    //     System.out.println("Tuesday"); break;
    //   case 3:
    //     System.out.println("Wednesday"); break;
    //   case 4:
    //     System.out.println("Thursday"); break;
    //   case 5:
    //     System.out.println("Friday"); break;
    //   case 6:
    //     System.out.println("Saturday"); break;
    //   case 7:
    //     System.out.println("Sunday"); break;
    //   default:
    //     System.out.println("Invalid");
    // }

    // switch(n) {
    //   case 1:
    //   case 2:
    //   case 3:
    //   case 4:
    //   case 5:
    //     System.out.println("Weekdays");
    //     break;
    //   case 6:
    //   case 7:
    //     System.out.println("Weekends");
    //     break;
    //   default:
    //     System.out.println("Invalid");
    // }

    // switch(n) {
    //     case 1 -> {System.out.println("Monday"); System.out.println(1);}
    //     case 2 -> System.out.println("Tuesday");        
    //     case 3 -> System.out.println("Wednesday");
    //     case 4 -> System.out.println("Thursday");
    //     case 5 -> System.out.println("Friday");
    //     case 6 -> System.out.println("Saturday");
    //     case 7 -> System.out.println("Sunday");
    //     default -> System.out.println("Invalid");
    //   }

    switch(n) {
      case 1, 2, 3, 4, 5, 6 -> System.out.println("Weekdays");
      case 7, 8 -> System.out.println("Weekends");
      default -> System.out.println("Invalid");
    }


    // Nested switch statements

    // System.out.print("Enter ur emp no: ");
    // int empno = sc.nextInt();
    // System.out.print("Enter ur dept(in small letters): ");
    // String dept = sc.next();

    // switch(empno) {
    //   case 1 -> System.out.println("Kunal Kuswaha");
    //   case 2 -> System.out.println("Rahul Rana");
    //   case 3 -> {
    //     System.out.println("Employee no is 3");
    //     switch(dept) {
    //       case "it" -> System.out.println("IT department");
    //       case "mechanical" -> System.out.println("Mechanical department");
    //       default -> System.out.println("No department");
    //     }
    //   }
    //   default -> System.out.println("Invalid emp no !");
    // }

    sc.close();

  }
}
