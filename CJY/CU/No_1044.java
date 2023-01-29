import java.io.*;

public class No_1044 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(Long.parseLong(br.readLine()) + 1));

        br.close();
        bw.flush();
        bw.close();
    }
}