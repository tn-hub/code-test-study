import java.io.*;

public class No_1092 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();

        long a = Long.parseLong(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 1;
        while (i % a != 0 || i % b != 0 || i % c != 0) {
            i++;
        }

        bw.write("" + i);
        bw.flush();
        bw.close();
    }
}