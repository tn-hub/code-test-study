import java.io.*;

public class No_1097 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[19][19];

        for (int i = 0; i < 19; i++) {
            String[] tmp = br.readLine().split(" ");
            System.arraycopy(tmp, 0, arr[i], 0, 19);
        }

        int n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]) - 1;
            int y = Integer.parseInt(xy[1]) - 1;

            for (int j = 0; j < 19; j++) {
                if(j == y) continue;
                arr[x][j] = arr[x][j].equals("0") ? "1" : "0";
            }

            for (int j = 0; j < 19; j++) {
                if(j == x) continue;
                arr[j][y] = arr[j][y].equals("0") ? "1" : "0";
            }
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