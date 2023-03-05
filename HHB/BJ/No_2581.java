package HHB.BJ;

import java.io.*;
public class No_2581 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 10001;


        for(int m=M; m<=N; m++) { //60 ~ 100 까지 반복

            if(m>1) {
                for(int j=2; j<=m; j++){ //60일때 2~60까지 반복

                    if(m%j == 0){ //j가 m의 약수거나 자기 자신일 때
                        if(j==m){ //자기 자신일 때
                            sum += m;
                            if(m<min) {
                                min=m;
                            }
                        }
                        else{ //j가 m의 약수일 때
                            break; //소수 아니니까 더이상 할 필요 X
                        }
                    }
                }
            }
        }

        if(sum!=0) {
            System.out.println(sum);
            System.out.println(min);
        }
        else {
            System.out.println("-1");
        }
        br.close();
    }
}
