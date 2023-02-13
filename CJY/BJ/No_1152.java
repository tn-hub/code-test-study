import java.io.*;

public class No_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(s.equals(" ")) {
            bw.write("0");
        } else {
            int len = s.length() - 1;
            if(s.charAt(len) == ' ') s = s.substring(0, len);
            if(s.charAt(0) == ' ') s = s.substring(1);
            bw.write(String.valueOf(s.split(" ").length));
        }

        bw.flush();
        bw.close();
    }
}