import java.io.*;

public class No_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arr = br.readLine().split("");
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for(String s : arr) sum += Integer.parseInt(s);
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}