import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = {"HND", "NRT", "KIX", "NGO", "NGO"};
        int count = 0;
        for(int i = 0;i<line.length-1;i++){
            if(line[i].equals(line[i+1])){
                count = count + 1;
            }
        }
        if(0<count){
            System.out.println("true");

        }else{
            System.out.println("false");
        }
    }
}
