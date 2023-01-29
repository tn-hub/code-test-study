import java.io.*;

public class No_1042 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(Integer.parseInt(arr[0]) / Integer.parseInt(arr[1])));

        br.close();
        bw.flush();
        bw.close();
    }
}
