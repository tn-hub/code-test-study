import java.io.*;

public class No_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        br.close();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i]);
            if(num == 1) cnt++;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    cnt++;
                    break;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(n - cnt));
        bw.flush();
        bw.close();
    }
}
