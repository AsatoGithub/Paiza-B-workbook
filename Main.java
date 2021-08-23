import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine();
        int m = sc.nextInt();
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        for(int i = 0; i<m; i++){
            map.put(sc.next(),sc.next());
        }
        System.out.println(map.get(T));
    }
}
