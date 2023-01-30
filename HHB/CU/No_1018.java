import java.io.*;
import java.util.StringTokenizer;

public class No_1018 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        String hour = st.nextToken();
        String minute = st.nextToken();

        System.out.print(hour + ":" + minute);

        br.close();
    }
}
