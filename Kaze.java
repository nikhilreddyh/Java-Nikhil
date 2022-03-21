
import java.util.*;
public class Kaze {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int t=0; t<n; t++) {
      ArrayList<Integer> list = new ArrayList<>();
      int len = sc.nextInt();
      int k = sc.nextInt();

      for(int i=0; i<len; i++) {
        list.add(sc.nextInt());
      }

      for(int i=0; i<k; i++) {
        int max = Collections.max(list);
        int in = list.indexOf(Collections.max(list));
        list.remove(in);

        if(max!=1) {
          if(max%2==0) {
            list.add(in,max/2);
            list.add(in+1,max/2);
          } else {

            list.add(in,max/2);
            list.add(in+1,max/2-1);
          }
        }
      }

      // System.out.println(list);
      System.out.println(Collections.max(list));
    }


  }
}
