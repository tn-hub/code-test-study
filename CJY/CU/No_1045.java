import java.io.*;

public class No_1045 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Long.parseLong(arr[0]) + Long.parseLong(arr[1])));
        bw.newLine();

        bw.write(String.valueOf(Long.parseLong(arr[0]) - Long.parseLong(arr[1])));
        bw.newLine();

        bw.write(String.valueOf(Long.parseLong(arr[0]) * Long.parseLong(arr[1])));
        bw.newLine();

        bw.write(String.valueOf(Integer.parseInt(arr[0]) / Integer.parseInt(arr[1])));
        bw.newLine();

        bw.write(String.valueOf(Integer.parseInt(arr[0]) % Integer.parseInt(arr[1])));
        bw.newLine();

        bw.write(String.format("%.2f", Float.parseFloat(arr[0]) / Integer.parseInt(arr[1])));

        bw.flush();
        bw.close();
    }
}