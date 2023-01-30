import java.io.*;

public class No_1032 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toHexString(Integer.parseInt(br.readLine())));

        br.close();
        bw.flush();
        bw.close();
    }
}
