import java.io.*;

public class No_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int reverseA = reverse(a);
        int b = Integer.parseInt(arr[1]);
        int reverseB = reverse(b);

        bw.write(reverseA > reverseB ? reverseA + "" : reverseB + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static int reverse(int x) {
        int answer = 0;
        while (x != 0) {
            int overflowCheck = answer * 10 + x % 10;
            if ((overflowCheck - x % 10) / 10 != answer) {
                return  0;
            }
            x /= 10;
            answer = overflowCheck;
        }
        return answer;
    }
}
