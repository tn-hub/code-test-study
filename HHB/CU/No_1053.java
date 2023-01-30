import java.io.*;

public class No_1053 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i1 = Integer.parseInt(br.readLine());

        if(i1 == 0){
            System.out.printf("1");
        }
        if(i1 == 1){
            System.out.printf("0");
        }

        br.close();
    }
}