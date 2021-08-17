import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] S = new String[n];
        int[] D = new int[n];
        for(int i = 0; i<n; i++){
            S[i] = sc.next();
            D[i] = sc.nextInt();
            System.out.println(D[i]);
        }
    }
}
