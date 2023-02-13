import java.io.*;

public class No_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        String str = br.readLine().strip();
        if(str.isBlank()){
            result = 0;
        } else {
            String[] arr = str.split(" ");
            result = arr.length;
        }
        bw.write(result+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
