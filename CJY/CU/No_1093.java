import java.io.*;

public class No_1093 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arr = br.readLine().split(" ");
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] cnt = new int[23];
        for (String s : arr) {
            cnt[Integer.parseInt(s) - 1]++;
        }

        for (int c : cnt) {
            bw.write(c + " ");
        }

        bw.flush();
        bw.close();
    }
}