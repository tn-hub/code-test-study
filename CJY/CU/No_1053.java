import java.io.*;

public class No_1053 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(br.readLine().equals("0") ? "1" : "0");

        br.close();
        bw.flush();
        bw.close();
    }
}