import java.io.*;

public class No_1086 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        double w = Double.parseDouble(arr[0]);
        int h = Integer.parseInt(arr[1]);
        int b = Integer.parseInt(arr[2]);

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%.2f", w * h * b / 8 / 1024 / 1024) + " MB");
        bw.flush();
        bw.close();
    }
}