import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(line.charAt(0)<=line.charAt(line.length()-1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
