import java.io.*;

public class No_1077 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int i = 0;

        while(true){
            if(i>n){
                break;
            }else{
                System.out.println(i);
            }
            i++;
        }

        br.close();
    }
}