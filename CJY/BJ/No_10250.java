import java.io.*;

public class No_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split(" ");
            int H = Integer.parseInt(arr[0]);
            int N = Integer.parseInt(arr[2]);
            int a = N % H == 0 ? H : N % H;
            int b = a == H ? N / H : (N / H) + 1;
            bw.write(a + (b > 9 ? "" : "0") + b);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}