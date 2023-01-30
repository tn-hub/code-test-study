import java.io.*;

public class No_1079 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(String s : arr) {
            bw.write(s);
            if(s.equals("q")) break;
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}