import java.io.*;

public class No_1099 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[10][10];

        for (int i = 0; i < 10; i++) {
            String[] tmp = br.readLine().split(" ");
            System.arraycopy(tmp, 0, arr[i], 0, 10);
        }

        br.close();

        int x = 1;
        int y = 1;

        while ((x != 8 || y != 8) && !arr[x][y].equals("2")) {
            arr[x][y] = "9";
            if (arr[x][y + 1].equals("1")) {
                x++;
            } else {
                y++;
            }
        }
        arr[x][y] = "9";

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}