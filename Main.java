import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {1, 3, 5, 6, 3, 2, 5, 23, 2};
        for(int i = 0; i<n.length-1; i++){
            for(int m = i + 1;m<n.length;m++){
                if(n[i]>n[m]){
                    int a = n[i];
                    n[i] = n[m];
                    n[m] = a;
                }
            }
        }
        for(int i = 0;i<n.length;i++){
            System.out.println(n[i]);
        }

    }
}
