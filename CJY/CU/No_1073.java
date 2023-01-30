import java.io.*;

public class No_1073 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(String s : arr) {
            if(s.equals("0")) break;
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}