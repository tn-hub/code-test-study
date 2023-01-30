import java.io.*;

public class No_1033 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.printf("%X",n);

        br.close();
    }
}