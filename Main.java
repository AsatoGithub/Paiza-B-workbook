import java.util.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> HS = new HashMap<Integer, String>();
        int n = sc.nextInt();
        sc.nextLine();
        String[] S = new String[n];
        int[] D = new int[n];
        for(int i = 0; i<n; i++){
            S[i] = sc.next();
            D[i] = sc.nextInt();
            HS.put(D[i],S[i]);
        }
        for(int l = 0; l<D.length-1; l++){
            for(int m = l + 1; m<D.length; m++){
                if(D[l]>D[m]){
                    int a = D[l];
                    D[l] = D[m];
                    D[m] = a;
                }
            }
        }
        for(int i = 0; i<D.length; i++){
            System.out.println(HS.get(D[i]));
        }

    }
}
