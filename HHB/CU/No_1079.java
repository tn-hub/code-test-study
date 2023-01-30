import java.io.*;

public class No_1079 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        for(String item : s){
            if(!item.equals("q")){
                System.out.println(item);
            }
            else{
                System.out.println(item);
                break;
            }
        }

        br.close();
    }
}