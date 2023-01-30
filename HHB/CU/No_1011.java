import java.util.*;
import java.io.*;

public class No_1011 {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));

        char c = br.readLine().charAt(0);
        bw.write(c);

        bw.flush(); bw.close(); br.close();
    }
}
