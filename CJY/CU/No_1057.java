import java.io.*;

public class No_1057 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(arr[0].equals(arr[1]) ? "1" : "0");

        bw.flush();
        bw.close();
    }
}