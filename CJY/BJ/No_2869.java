import java.io.*;

public class No_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int v = Integer.parseInt(arr[2]) - a;
        int p = 0;
        int c = 1;

        while (true) {
            p += a;
            if(p >= (v  % (a - b)) + a) break;
            p -= b;
            c++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf((v / (a - b)) + c));
        bw.flush();
        bw.close();
    }
}
