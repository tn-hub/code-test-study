import java.io.*;

public class No_1058 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(arr[0].equals("0") && arr[1].equals("0") ? "1" : "0");

        bw.flush();
        bw.close();
    }
}