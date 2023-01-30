import java.io.*;

public class No_1037 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.parseInt(br.readLine(), 10));

        br.close();
        bw.flush();
        bw.close();
    }
}
