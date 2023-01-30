import java.io.*;

public class No_1035 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toOctalString(Integer.parseInt(br.readLine(), 16)));

        br.close();
        bw.flush();
        bw.close();
    }
}
