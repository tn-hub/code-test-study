import java.io.*;

public class No_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        br.close();

        int[] alp = new int[26];
        for (int i = 0, len = s.length(); i < len; i++) alp[s.charAt(i) - 65]++;

        int max = 0;
        char answer = 0;
        boolean b = false;

        for (int i = 0; i < 26; i++) {
            if(alp[i] == 0) continue;
            if(max < alp[i]) {
                max = alp[i];
                answer = (char) (i + 65);
                b = false;
            } else if(max == alp[i]) {
                b = true;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(b ? "?" : String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
