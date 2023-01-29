import java.io.*;

public class No_1088 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= n; i++) {
            if(i % 3 != 0) {
                bw.write("" + i);
                if(i != n) bw.write(" ");
            }
        }

        bw.flush();
        bw.close();
    }
}