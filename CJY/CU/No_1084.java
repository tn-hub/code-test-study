import java.io.*;

public class No_1084 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int r = Integer.parseInt(arr[0]);
        int g = Integer.parseInt(arr[1]);
        int b = Integer.parseInt(arr[2]);

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    bw.write(i + " " + j + " " + k);
                    bw.newLine();
                    cnt++;
                }
            }
        }

        bw.write("" + cnt);
        bw.flush();
        bw.close();
    }
}