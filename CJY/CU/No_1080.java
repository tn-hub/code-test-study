import java.io.*;

public class No_1080 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if(sum >= n) {
                bw.write("" + i);
                break;
            };
        }

        bw.flush();
        bw.close();
    }
}