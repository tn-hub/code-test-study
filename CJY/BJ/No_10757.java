import java.io.*;
import java.math.BigInteger;

public class No_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(new BigInteger(arr[0]).add(new BigInteger(arr[1]))));
        bw.flush();
        bw.close();
    }
}