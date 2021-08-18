import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (char c = s.charAt(0); c <= s.charAt(s.length()-1); c++){
          System.out.println(c);
        }
    }
}
