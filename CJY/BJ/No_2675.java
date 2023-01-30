import java.io.*;

public class No_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int r;
        String[] arr1;
        String[] arr2;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < t; i++) {
            arr1 = br.readLine().split(" ");
            r = Integer.parseInt(arr1[0]);
            arr2 = arr1[1].split("");
            for (String s : arr2) for (int j = 0; j < r; j++) bw.write(s);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}