import java.io.*;

public class No_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 소인수분해할 정수 N
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(N > 1) {
            for (int i = 2; i <= N; i++) {
                if(N % i == 0) { // 소수인 경우 출력
                    N = N / i;
                    bw.write(String.valueOf(i));
                    bw.newLine();
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
