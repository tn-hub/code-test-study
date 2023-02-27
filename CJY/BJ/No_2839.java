import java.io.*;

public class No_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int s = 0;
        for (int i = n / 5; i >= 0; i--) {
            if((n - (i * 5)) % 3 == 0){
                s = i + ((n - (i * 5)) / 3);
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(s == 0 ? "-1" : s));
        bw.flush();
        bw.close();
    }
}