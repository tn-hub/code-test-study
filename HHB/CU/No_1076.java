import java.io.*;

public class No_1076 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = br.readLine().charAt(0);
        int i = 96;

        while(true){
            if(i==n){
                break;
            }else{
                System.out.print((char)(i+1) + " ");
            }
            i++;
        }

        br.close();
    }
}