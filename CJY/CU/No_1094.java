import java.io.*;

public class No_1094 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arr = br.readLine().split(" ");
        int len = arr.length;
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = len; i > 0; i--) bw.write(arr[i - 1] + " ");

        bw.flush();
        bw.close();
    }
}