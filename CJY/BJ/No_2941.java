import java.io.*;

public class No_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(br.readLine().replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "*").length()));
        br.close();
        bw.flush();
        bw.close();
    }
}