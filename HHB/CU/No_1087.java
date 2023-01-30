import java.io.*;

public class No_1087 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<=n; i++){
            sum += i;
            if(sum>=n){
                System.out.print(sum);
                break;
            }
        }

        br.close();
    }
}