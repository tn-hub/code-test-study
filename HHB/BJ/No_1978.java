package HHB.BJ;

import java.io.*;
import java.util.StringTokenizer;

public class No_1978 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            int count = 0;

            if(temp>1){
                for(int j=2; j<=temp; j++){
                    if(temp%j == 0){
                        if(j==temp && count==0){
                            result++;
                        }
                        else{
                            count++;
                        }
                    }
                }
            }
            else {
                continue;
            }
        }
        System.out.println(result);

        br.close();
    }
}
