import java.io.*;

public class No_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = 1, a = 1;
        while (n > c) {
            c += 6 * a;
            a++;
        }
        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
    }
}