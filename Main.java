import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] Array = new String[5][5];
        String result = "D";
        String line = "";
        for(int i = 0; i<5; i++){
            Array[i] = sc.next().split("");
        }

        //縦の判定
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
               line = line + Array[j][i];
            }
            if(line.equals("XXXXX")){
                result = "X";
            }else if(line.equals("OOOOO")){
                result = "O";
            }
            line = "";
        }

        //横の判定
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                line = line + Array[i][j];
            }
            if(line.equals("XXXXX")){
                result = "X";
            }else if(line.equals("OOOOO")){
                result = "O";
            }
            line = "";
        }

        //左上から右下のline判定
        for(int i = 0; i<5; i++){
            line = line + Array[i][i];
        }
        if(line.equals("XXXXX")){
            result = "X";
            }else if(line.equals("OOOOO")){
                result = "O";
            }
            line = "";

        //右上から左下のline判定
        for(int i = 0; i<5; i++){
            line = line + Array[i][4-i];
        }
        if(line.equals("XXXXX")){
            result = "X";
            }else if(line.equals("OOOOO")){
                result = "O";
            }

            //判定出力
            System.out.println(result);
    }
}
