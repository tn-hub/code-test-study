import java.io.*;

public class No_1075 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while(n>0){
            System.out.println(n-1);
            n--;
        }

        br.close();
    }
}