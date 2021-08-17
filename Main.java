import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] A = new String[n];
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            A[i] = sc.next();
            a[i] = Integer.parseInt(A[i]);
        }
        for(int m = 0; m<a.length; m++){
            for(int j = m + 1; j<a.length; j++){
                if(a[m]>a[j]){
                    int k = a[m];
                    a[m] = a[j];
                    a[j] = k;
                }
            }
        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
