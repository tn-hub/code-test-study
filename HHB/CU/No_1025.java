import java.io.*;

public class No_1025 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split("");

        System.out.println("[" + Integer.parseInt(num[0])*10000 + "]");
        System.out.println("[" + Integer.parseInt(num[1])*1000 + "]");
        System.out.println("[" + Integer.parseInt(num[2])*100 + "]");
        System.out.println("[" + Integer.parseInt(num[3])*10 + "]");
        System.out.println("[" + Integer.parseInt(num[4]) + "]");

        br.close();
    }
}
