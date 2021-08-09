import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String c = sc.nextLine();
        String[] s = sc.nextLine().split("");
        for(int i = 0; i<s.length;i++){
            if(c.equals(s[i])){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
