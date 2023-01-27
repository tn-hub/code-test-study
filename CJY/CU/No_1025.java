import java.io.*;

public class No_1025 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = arr.length;
        StringBuilder z = new StringBuilder();
        for (int i = len; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) z.append('0');
            bw.write("[" + arr[len - i] + z + "]");
            bw.newLine();
            z.setLength(0);
        }

        bw.flush();
        bw.close();
    }
}
