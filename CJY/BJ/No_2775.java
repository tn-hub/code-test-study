import java.io.*;

public class No_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];
            for (int j = 1; j <= n; j++) arr[j - 1] = j;
            for (int j = 0; j < k; j++) for (int l = 1; l < n; l++) arr[l] = arr[l - 1] + arr[l];
            bw.write(String.valueOf(arr[n - 1]));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}