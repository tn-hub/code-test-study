import java.io.*;
import java.util.StringTokenizer;

public class No_1055 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());

        if(i1==1 || i2==1){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }

        br.close();
    }
}