import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int count = 0;
        for(int i = 0;i<=t.length() - s.length();i++){
            String string = t.substring(i, i + s.length());
            if(string.equals(s)){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
