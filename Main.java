import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String table[][] = new String[5][5];
        String result = "D";

        for(int i = 0; i < 5; i++) {
            table[i] = sc.next().split("");
        }

        for(int i = 0; i < 5; i++) {
            String line = "";
            for(int j = 0; j < 5; j++) {
                line += table[i][j];
                if(line.equals("OOOOO")) {
                    result = "O";
                } else if(line.equals("XXXXX")) {
                    result = "X";
                }
            }
        }

        for(int i = 0; i < 5; i++) {
            String line = "";
            for(int j = 0; j < 5; j++) {
                line += table[j][i];
                if(line.equals("OOOOO")) {
                    result = "O";
                } else if(line.equals("XXXXX")) {
                    result = "X";
                }
            }
        }

        //右ナナメのラインを判定しresult変数に代入する
        String diagR = judgement(diagRightUp(table));
        if(!diagR.equals("D")) {
            result = diagR;
        }

        //左ナナメのラインを判定しなんたら
        String diagL = judgement(diagLeftUp(table));
        if(!diagL.equals("D")) {
            result = diagL;
        }

        System.out.println(result);
        sc.close();
    }

    static String diagRightUp(String[][] table) {
        String line = "";
        for(int i = 0; i < 5; i++) {
            line += table[i][- (i - 4)];
        }

        return line;
    }

    static String diagLeftUp(String[][] table) {
        String line = "";
        for(int i = 0; i < 5; i++) {
            line += table[i][i];
        }

        return line;
    }

    static String judgement(String line) {
        if(line.equals("OOOOO")) {
            return "O";
        } else if(line.equals("XXXXX")) {
            return "X";
        }else{
          return "D";
        }
    }
}
