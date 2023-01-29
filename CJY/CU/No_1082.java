import java.io.*;

public class No_1082 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= Integer.parseInt("F", 16); i++) {
            bw.write(n + "*" + Integer.toHexString(i).toUpperCase() + "=" + Integer.toHexString((Integer.parseInt(n, 16) * i)).toUpperCase());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}