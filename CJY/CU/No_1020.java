import java.io.*;

public class No_1020 {
    public static void main (String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        bw.write(br.readLine().replace("-", ""));

        bw.flush();
        bw.close();
        br.close();
    }
}
