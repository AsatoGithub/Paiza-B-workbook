import java.util.*;
public class Main {
  public static void main(String[] args) {
    LinkedHashMap<String, String> hs = new LinkedHashMap<String, String>();
    hs.put("Kyoko", "B");
    hs.put("Rio", "O");
    hs.put("Tsubame", "AB");
    hs.put("KurodaSensei", "A");
    hs.put("NekoSensei", "A");
    for (String S : hs.keySet()) {
      System.out.println(S + " " + hs.get(S));
    }
  }
}
