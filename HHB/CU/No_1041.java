import java.io.*;

public class No_1041 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = br.readLine().charAt(0);

        System.out.print((char)(n+1));

        br.close();
    }
}