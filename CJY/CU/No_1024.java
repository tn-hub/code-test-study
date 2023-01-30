import java.io.*;

public class No_1024 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(char c : arr) {
            bw.write("'" + c + "'");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
