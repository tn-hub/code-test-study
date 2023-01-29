import java.io.*;

public class No_1076 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = br.read();

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 'a'; i <= n; i++) {
            bw.write(i);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}