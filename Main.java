import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, String> Usermap = new LinkedHashMap<String, String>();
        LinkedHashMap<String, String> Bloodmap = new LinkedHashMap<String, String>();

        String U = sc.nextLine();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            Usermap.put(sc.next(),sc.next());
        }

        int m = sc.nextInt();
        for(int i = 0; i<m; i++){
            Bloodmap.put(sc.next(),sc.next());
        }

        String BloodType = Usermap.get(U);
        System.out.println(Bloodmap.get(BloodType));
    }
}
