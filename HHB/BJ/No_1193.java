package HHB.BJ;
import java.io.*;
public class No_1193 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int count = 1;
                                            //  x  +  count
        // 1/1                  // 1            0  +  1
        // 1/2 2/1              // 2     3      1  +  2
        // 3/1 2/2 1/3          // 4  ~  6      3  +  3
        // 1/4 2/3 3/2 4/1      // 7  ~ 10      6  +  4
        // 5/1 4/2 3/3 2/4 1/5  // 11 ~ 15      10 +  5

        while(x+count < n){
            x = x + count;
            count++;
        }

        //홀수(count)번째 줄 -> count / 1 로 시작
        //짝수(count)번째 줄 -> 1 / count 로 시작

        if(count%2==0){
            System.out.println((n-x) + "/" + (count-(n-x-1)));
        }
        else{
            System.out.println((count-(n-x-1)) + "/" + (n-x));
        }

        br.close();
    }
}
