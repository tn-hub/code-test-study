import java.io.*;

public class No_1026 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] clock = br.readLine().split(":");

        if(clock[1].length()>1 && clock[1].charAt(0) == '0'){
            System.out.print(clock[1].charAt(1));
        }else{
            System.out.print(clock[1]);
        }

        br.close();
    }
}