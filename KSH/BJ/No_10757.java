import java.io.*;
import java.math.BigInteger;

public class No_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        BigInteger A = new BigInteger(str[0]);
        BigInteger B = new BigInteger(str[1]);
        bw.write(A.add(B) +"");

        br.close();
        bw.flush();
        bw.close();
    }
}
