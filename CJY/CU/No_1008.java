import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class No_1008 {
    public static void main (String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\u250C\u252C\u2510\n\u251C\u253C\u2524\n\u2514\u2534\u2518");

        bw.flush();
        bw.close();
    }
}
