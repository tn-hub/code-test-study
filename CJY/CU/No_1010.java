import java.io.*;

public class No_1010 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(i));

        bw.flush();
        bw.close();
    }
}
