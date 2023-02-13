import java.io.*;

public class No_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();

        String a = "";
        String b = "";
        for (int i = arr[0].length() - 1; i >= 0; i--) a += arr[0].charAt(i);
        for (int i = arr[1].length() - 1; i >= 0; i--) b += arr[1].charAt(i);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.parseInt(a) > Integer.parseInt(b) ? a : b);

        bw.flush();
        bw.close();
    }
}