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
        String[] S = new String[2];
            S[0] = String.valueOf(Array.get(0).charAt(0))+String.valueOf(Array.get(1).charAt(1)+String.valueOf(Array.get(2).charAt(2))+String.valueOf(Array.get(3).charAt(3))+String.valueOf(Array.get(4).charAt(4)));
            S[1] = String.valueOf(Array.get(0).charAt(4))+String.valueOf(Array.get(1).charAt(3)+String.valueOf(Array.get(2).charAt(2))+String.valueOf(Array.get(3).charAt(1))+String.valueOf(Array.get(4).charAt(0)));


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
