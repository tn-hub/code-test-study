import java.io.*;

public class No_1098 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] wh = br.readLine().split(" ");
        int w = Integer.parseInt(wh[0]);
        int h = Integer.parseInt(wh[1]);
        int[][] arr = new int[w][h];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] ldxy = br.readLine().split(" ");
            int l = Integer.parseInt(ldxy[0]);
            String d = ldxy[1];
            int x = Integer.parseInt(ldxy[2]) - 1;
            int y = Integer.parseInt(ldxy[3]) - 1;

            if(d.equals("0")) {
                for (int j = y; j < y + l; j++) {
                    arr[x][j] = 1;
                }
            } else {
                for (int j = x; j < x + l; j++) {
                    arr[j][y] = 1;
                }
            }
        }

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}