import java.io.*;

public class No_1034 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(Integer.parseInt(br.readLine(), 8)));

        br.close();
        bw.flush();
        bw.close();
    }
}
