import java.io.*;
import java.util.StringTokenizer;

public class No_1013 {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        System.out.print(n1 + " " + n2);

        br.close();
    }
}