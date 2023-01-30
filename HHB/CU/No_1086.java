import java.io.*;
import java.util.StringTokenizer;

public class No_1086 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        float w = Float.parseFloat(st.nextToken());
        float h = Float.parseFloat(st.nextToken());
        float b = Float.parseFloat(st.nextToken());

        double result = (((w * h * b) /8)/Math.pow(2, 10))/Math.pow(2, 10);

        System.out.format("%.2f MB", result);

        br.close();
    }
}