import java.io.*;

public class No_1041 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(br.read() + 1);

        br.close();
        bw.flush();
        bw.close();
    }
}
