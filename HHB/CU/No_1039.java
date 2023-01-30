import java.io.*;

public class No_1039 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        long sum = Long.parseLong(str[0]) + Long.parseLong(str[1]);

        System.out.print(sum);

        br.close();
    }
}