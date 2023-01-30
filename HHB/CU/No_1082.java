import java.io.*;

public class No_1082 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine(), 16);

        for(int i=1; i<16; i++){
            System.out.printf("%X*%X=%X\n", n, i, n*i);
        }

        br.close();
    }
}