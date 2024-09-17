package HHB.BJ;

import java.io.*;
public class No_2839 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //배달해야하는 설탕
        //봉지 3kg, 5kg
        int count = 0;
        while(N>0){
            if(N%5==0){ //5의 배수O
                count += N/5;
                break;
            }
            else if(N>=3){ //5의 배수X
                N -= 3;
                count++;
            }
            else{
                count = -1;
                break;
            }
        }
        System.out.println(count);

        br.close();
    }
}
