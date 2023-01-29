import java.io.*;

public class No_1075 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < n; i++) {
            bw.write("" + (n - i - 1));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}