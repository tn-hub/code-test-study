import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class No_4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = new int[10000];

        for (int i = 1; i <= 10000; i++) {
            int s = 0;
            int t = i;
            for (int j = 1; j <= 5; j++) {
                s += t % 10;
                t = t / 10;
            }
            n[i - 1] += s;
        }

        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j <= i; j++) {
                if(i - j - n[j - 1] == 0) break;
                if(i == j) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
