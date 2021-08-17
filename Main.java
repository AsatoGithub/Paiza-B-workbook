import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = sc.nextInt();
        }
        for(int m = 0; m<n; m++){
            if(a[m] == b[m]){
                answer = answer + (a[m] * b[m]);
            }else{
                answer = answer + a[m] + b[m];
            }
        }
        System.out.println(answer);
    }
}
