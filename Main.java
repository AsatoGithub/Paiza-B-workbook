import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[2];
        for(int i =0;i<Array.length;i++){
            Array[i] = sc.nextInt();
        }
        System.out.println(Array[0] + Array[1]);
    }
}
