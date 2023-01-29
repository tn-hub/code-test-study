import java.io.*;

public class No_1085 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        double h = Double.parseDouble(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int s = Integer.parseInt(arr[3]);

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%.1f", h * b * c * s / 8 / 1024 / 1024) + " MB");
        bw.flush();
        bw.close();
    }
}