import java.io.*;

public class No_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 'a'; i <= 'z'; i++) bw.write(s.indexOf(i) + " ");
        bw.flush();
        bw.close();
    }
}