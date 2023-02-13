import java.io.*;

public class No_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        int[] alp = new int[26];
        int cnt = 2;
        for (int i = 0; i < 26; i++) {
            if(i % 3 == 0 && i <= 15 || i == 19 || i == 22) cnt++;
            alp[i] = cnt;
        }

        int sum = 0;
        for (int i = 0, len = s.length(); i < len; i++) sum += alp[s.charAt(i) - 65];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}