import java.io.*;

public class No_1091 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();

        long a = Long.parseLong(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int d = Integer.parseInt(arr[2]);
        int n = Integer.parseInt(arr[3]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i < n; i++) a = a * m + d;

        bw.write("" + a);
        bw.flush();
        bw.close();
    }
}