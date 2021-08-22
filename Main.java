import java.util.*;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedHashMap<String, String> hs = new LinkedHashMap<String, String>();
    String s = sc.nextLine();
    int n = sc.nextInt();
    for(int i = 0; i<n; i++){
        hs.put(sc.next(),sc.next());
    }
      System.out.println(s + " " + hs.get(s));
  }
}
