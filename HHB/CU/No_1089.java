import java.io.*;
import java.util.StringTokenizer;

public class No_1089 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i=1; i<n; i++){
            a += d;
        }

        System.out.print(a);

        br.close();
    }
}