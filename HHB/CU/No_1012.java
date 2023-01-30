import java.io.*;

public class No_1012 {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        float c = Float.parseFloat(br.readLine());

        System.out.println(String.format("%.6f", c));

        br.close();
    }
}