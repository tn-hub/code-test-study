import java.io.*;
import java.util.StringTokenizer;

public class No_1046 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());
        int i3 = Integer.parseInt(st.nextToken());

        System.out.println(i1 + i2 + i3);
        System.out.printf("%.1f", (float)(i1 + i2 + i3)/3);

        br.close();
    }
}