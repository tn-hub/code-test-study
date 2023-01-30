import java.io.*;

public class No_1029 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double f1 = Double.parseDouble(br.readLine());

        System.out.print(String.format("%.11f", f1));

        br.close();
    }
}