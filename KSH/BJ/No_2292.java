import java.io.*;

public class No_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;

        if(n != 1){
            while (range <= n){
                range += 6 * count;
                count++;
            }
        }
        bw.write(count+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
/*
1       +6
2~7     +12
8~19    +18
20~37   +24
38~61   +30

원형 형태 범위를 지남
*/