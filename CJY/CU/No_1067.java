import java.io.*;

public class No_1067 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(n > 0 ? "plus" : "minus");
        bw.newLine();

        bw.write(n % 2 == 0 ? "even" : "odd");

        bw.flush();
        bw.close();
    }
}