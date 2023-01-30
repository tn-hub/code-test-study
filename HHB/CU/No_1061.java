import java.io.*;
import java.util.StringTokenizer;

public class No_1061 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());

        System.out.print(i1 | i2);

        br.close();
    }
}