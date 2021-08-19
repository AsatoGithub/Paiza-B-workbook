import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        ArrayList<String> Array = new ArrayList<String>();
        while(sc.hasNextLine()){
            String string = sc.nextLine();
            Array.add(string);
        }
        String[] S = new String[Array.size()];
        for(int i = 0; i<S.length; i++){
            S[i] = String.valueOf(Array.get(0).charAt(i))+String.valueOf(Array.get(1).charAt(i)+String.valueOf(Array.get(2).charAt(i))+String.valueOf(Array.get(3).charAt(i))+String.valueOf(Array.get(4).charAt(i)));

        }
        for(int n = 0; n<S.length; n++){
            if(S[n].equals("OOOOO")){
                System.out.println("O");
                count = count + 1;
            }else if(S[n].equals("XXXXX")){
                System.out.println("X");
                count = count + 1;
            }
        }
        if(count == 0){
            System.out.println("D");
        }
    }
}
