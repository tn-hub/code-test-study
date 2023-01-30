import java.io.*;

public class No_1096 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[19][19];
        int n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            String[] xy = br.readLine().split(" ");
            arr[Integer.parseInt(xy[0]) - 1][Integer.parseInt(xy[1]) - 1] = 1;
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}