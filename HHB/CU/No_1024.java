import java.io.*;

public class No_1024 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            System.out.println("\'" + str.charAt(i) + "\'");
        }

        br.close();
    }
}