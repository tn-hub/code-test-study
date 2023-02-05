import java.io.*;

public class No_42675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int r = Integer.parseInt(arr[0]);
            String[] s = arr[1].split("");
            String p = "";
            for (int j = 0; j < s.length; j++) {
                String temp = s[j];
                for (int k = 0; k < r; k++) {
                    p += temp;
                }
            }
            bw.write(p+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
