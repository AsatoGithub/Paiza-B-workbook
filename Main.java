import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    HashMap<String, Integer> map = new HashMap<>();

    for (int i=0; i<n; i++) {
      String c = sc.next();
      int v = sc.nextInt();
      if (map.containsKey(c))
        map.put(c, map.get(c) + v);
      else
        map.put(c, v);
    }

    List<Integer> ll = new ArrayList<>(map.values());
    Collections.sort(ll);
    Collections.reverse(ll);

    for (int v : ll){
      for (String c : map.keySet()){
        if (map.get(c) == v){
          System.out.println(c + " " + v);
        }
      }
    }
  }
}
