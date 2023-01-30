import java.io.*;
import java.util.StringTokenizer;

public class No_1023 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");

        String f1 = st.nextToken();
        String f2 = st.nextToken();

        System.out.println(f1);
        System.out.print(f2);

        br.close();
    }
}