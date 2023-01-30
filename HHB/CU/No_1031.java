import java.io.*;

public class No_1031 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.printf("%o",n);

        br.close();
    }
}