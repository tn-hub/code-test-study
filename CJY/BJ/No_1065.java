import java.io.*;

public class No_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int cnt;
        if(n < 100) {
            cnt = n;
        } else {
            cnt = 99;
            for(int i = 100; i <= n; i++) {
                if (i == 1000) break;
                if((i % 10) - ((i / 100) % 10) == ((i % 10) - ((i / 10) % 10)) * 2) cnt++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
