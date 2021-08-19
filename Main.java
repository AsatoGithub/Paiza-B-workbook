import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        String s = sc.nextLine();
        if (s.equals("OOOOO")) {
            System.out.println("O");
        }else if(s.equals("XXXXX")) {
            System.out.println("X");
        } else {
            System.out.println("D");
        }
    }
}
