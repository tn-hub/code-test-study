import java.io.*;

public class No_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        bw.write(sum+"");
        br.close();
        bw.flush();
        bw.close();
    }
}
