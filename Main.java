import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] line = sc.nextLine().split("");
        System.out.println(line[n-1] + " " + line[n]);
    }
}
