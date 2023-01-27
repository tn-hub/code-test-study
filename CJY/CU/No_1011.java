import java.io.*;

public class No_1011 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char s = (char) br.read();

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(s);

        bw.flush();
        bw.close();
    }
}
