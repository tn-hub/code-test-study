import java.io.*;

public class No_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int totalCnt = 0;
        if (n == 4 || n == 7) {
            totalCnt = -1;
        }
        else if (n % 5 == 0) {
            totalCnt = n / 5;
        }
        else if (n % 5 == 1 || n % 5 == 3) {
            totalCnt = (n / 5) + 1;
        }
        else if (n % 5 == 2 || n % 5 == 4) {
            totalCnt = (n / 5) + 2;
        }
        bw.write(totalCnt+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
