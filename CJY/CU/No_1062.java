import java.io.*;

public class No_1062 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Integer.parseInt(arr[0]) ^ Integer.parseInt(arr[1])));

        bw.flush();
        bw.close();
    }
}