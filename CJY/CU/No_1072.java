import java.io.*;

public class No_1072 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] arr = br.readLine().split(" ");

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < n; i++) {
            bw.write(arr[i]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}