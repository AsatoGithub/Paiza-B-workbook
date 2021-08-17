import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = sc.nextLine();
        int count = 0;
        for(int i = 0; i <= c.length() - s.length(); i++) {
            String a = c.substring(i, i + s.length());
            if (a.equals(s)) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
