import java.io.*;

public class No_1047 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i1 = Integer.parseInt(br.readLine());

        System.out.print(i1<<1);

        br.close();
    }
}