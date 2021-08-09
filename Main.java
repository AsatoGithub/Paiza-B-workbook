import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        System.out.println(line.substring(0,a - 1) + line.substring(a - 1, b).toUpperCase() + line.substring(b));
        }
    }
