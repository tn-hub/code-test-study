import java.io.*;
import java.util.StringTokenizer;

public class No_1073 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(true){
            int n = Integer.parseInt(st.nextToken());
            if(n!=0){
                System.out.println(n);
            }
            else{
                break;
            }
        }

        br.close();
    }
}