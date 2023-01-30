import java.io.*;

public class No_1074 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while(n>0){
            System.out.println(n);
            n--;
        }

        br.close();
    }
}