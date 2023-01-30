import java.io.*;
import java.util.StringTokenizer;

public class No_1014 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        char c1 = st.nextToken().charAt(0);
        char c2 = st.nextToken().charAt(0);

        System.out.print(c2 + " " + c1);

        br.close();
    }
}
