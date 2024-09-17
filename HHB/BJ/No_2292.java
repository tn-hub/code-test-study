package HHB.BJ;
import java.io.*;
public class No_2292 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int x = 1;

        //1
        //7  ~  3  1+6*1
        //19 ~  8  7+6*2
        //37 ~ 20 19+6*3
        //61 ~ 38 37+6*4

        if(n==1){
            System.out.println(count);
        }
        else{
            while(x<=n){
                x = x + (6 * count);
                count++;
            }
            System.out.println(count);
        }

        br.close();
    }
}
