import java.util.*;
public class Demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // float num = sc.nextFloat();
        // int num = sc.nextInt();
        // System.out.println(num);

        // type casting
        // int num = (int)(67.56f);
        // System.out.println(num);

        // automatic type promotions in expression
        // int a = 257;
        // byte b = (byte)(a);  // 257%256
        // System.out.println(a+" "+b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a*b)/c;

        // System.out.println(d);

        // byte b = 50;
        // b = (byte)(b*2);
        // System.out.println(b);

        // int num = 'A';
        // System.out.println(3*5);


        // byte b = 42;
        // char c = 'a';
        // short s = 1024;
        // int i = 50_000;
        // float f = 5.67f;
        // double d = 0.1234;
        // double result = (f*b)+(i/c)-(d*s);

        // System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        // System.out.println(result);


        // int a = 10;
        // if(a==10) {
        //   System.out.println("Hello world");
        // }

        // int count = 1;
        // while(count!=5) {
        //   System.out.println(count);
        //   count++;
        // }

        // for(int count=1; count!=5; count++) {
        //   System.out.println(count);
        // }

        System.out.print("please enter temperature in celsius: ");
        float tempC = sc.nextFloat();
        float tempF = tempC*1.8f+32;
        System.out.println(tempF);
  }
}