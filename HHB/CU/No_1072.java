import java.io.*;

public class No_1072 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String[] s1 = br.readLine().split(" ");

        for(String s2: s1){
            System.out.println(s2.trim());
        }

        br.close();
    }
}