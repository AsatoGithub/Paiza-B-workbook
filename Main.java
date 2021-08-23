import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String Array[] = sc.next().split("");

    if (n < Array.length) {
      System.out.println(Array[n - 1] + " " + Array[n]);
    }
  }
}
