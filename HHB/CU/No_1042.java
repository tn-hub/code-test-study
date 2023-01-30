import java.io.*;

public class No_1042 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        System.out.print(Integer.parseInt(str[0]) / Integer.parseInt(str[1]));

        br.close();
    }
}