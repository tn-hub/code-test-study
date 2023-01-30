import java.io.*;

public class No_1015 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float f1 = Float.parseFloat(br.readLine());

        System.out.print(String.format("%.2f", f1));

        br.close();
    }
}
