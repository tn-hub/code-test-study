import java.io.*;
import java.util.StringTokenizer;

public class No_1085 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        float h = Float.parseFloat(st.nextToken());
        float b = Float.parseFloat(st.nextToken());
        float c = Float.parseFloat(st.nextToken());
        float s = Float.parseFloat(st.nextToken());

        double result = (((h * b * c * s) / 8)/Math.pow(2, 10)) /Math.pow(2, 10);
        System.out.format("%.1f MB", result);

        br.close();
    }
}