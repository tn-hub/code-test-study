import java.io.*;

public class No_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int i = 1, s = 1;
        while (n > s) {
            i++;
            s += i;
        }
        n = s - n;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(i % 2 == 0 ? (i - n) + "/" + (1 + n) : (1 + n) + "/" + (i - n));
        bw.flush();
        bw.close();
    }
}