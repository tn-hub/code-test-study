import java.io.*;

public class No_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = n;

        for (int i = 0; i < n; i++) {
            boolean[] arr = new boolean[26];
            String s = br.readLine();
            for (int j = 0, len = s.length(); j < len; j++) {
                if(j > 0 && s.charAt(j) != s.charAt(j - 1) && arr[s.charAt(j) - 97]) {
                    cnt--;
                    break;
                }
                arr[s.charAt(j) - 97] = true;
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}