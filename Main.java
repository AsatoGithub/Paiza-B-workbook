import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        for(int i = 0;i<n;i++){
            Array[i] = sc.nextInt();
        }
        for (int m = 0; m < Array.length - 1; m++) {
            for (int j = m + 1; j < Array.length ; j++) {
                if (Array[m] > Array[j]) {
                    int a = Array[m];
                    Array[m] = Array[j];
                    Array[j] = a;
                }
            }
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
