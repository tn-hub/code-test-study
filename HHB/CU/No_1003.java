import java.io.*;

public class No_1003 {
    public static void main (String args[]) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello\nWorld");

        bw.flush();
        bw.close();
    }
}
