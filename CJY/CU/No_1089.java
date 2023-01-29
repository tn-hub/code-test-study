import java.io.*;

public class No_1089 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();

        int a = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);
        int n = Integer.parseInt(arr[2]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i < n; i++) a += d;

        bw.write("" + a);
        bw.flush();
        bw.close();
    }
}