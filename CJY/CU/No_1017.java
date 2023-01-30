import java.io.*;

public class No_1017 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String i = br.readLine();

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(i + " " + i + " " + i);

        bw.flush();
        bw.close();
    }
}
