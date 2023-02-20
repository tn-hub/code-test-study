import java.io.*;

public class No_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();

        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(b < c ? String.valueOf((Integer.parseInt(arr[0]) / (c - b)) + 1) : "-1");
        bw.flush();
        bw.close();
    }
}