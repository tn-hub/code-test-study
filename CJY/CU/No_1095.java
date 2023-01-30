import java.io.*;

public class No_1095 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arr = br.readLine().split(" ");
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String answer = arr[0];
        for (String s : arr) if(Integer.parseInt(answer) > Integer.parseInt(s)) answer = s;

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}