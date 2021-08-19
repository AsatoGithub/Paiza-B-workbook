import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        String s5 = sc.nextLine();
        String O = "OOOOO";
        String X = "XXXXX";

        if(s1.equals(O) || s2.equals(O) || s3.equals(O) || s4.equals(O) || s5.equals(O)){
            System.out.println("O");
        }else if(s1.equals(X) || s2.equals(X) || s3.equals(X) || s4.equals(X) || s5.equals(X)){
            System.out.println("X");
        }else{
            System.out.println("D");
        }

    }
}
