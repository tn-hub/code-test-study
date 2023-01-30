import java.io.*;
import java.util.StringTokenizer;

public class No_1027 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");

        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        System.out.printf("%02d-%02d-%04d", day, month, year); //String format 사용시

        br.close();
    }
}