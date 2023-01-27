import java.io.*;

public class No_1029 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%.011f", Double.parseDouble(br.readLine())));

        br.close();
        bw.flush();
        bw.close();
    }
}
