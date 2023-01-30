import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class No_1007 {
    public static void main (String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\"C:\\Download\\hello.cpp\"");

        bw.flush();
        bw.close();
    }
}