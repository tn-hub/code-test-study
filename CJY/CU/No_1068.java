import java.io.*;

public class No_1068 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(n >= 90 ? "A" : (n >= 70 ? "B" : (n >= 40 ? "C" : "D")));

        bw.flush();
        bw.close();
    }
}