package HHB.BJ;

import java.io.*;
import java.util.*;

public class No_4673 {
    public static int d(int n) {
        int sum = n;

        while (n != 0) {
            sum = sum + (n % 10); //n + n의 1의 자리수
            n = n / 10;
        }
        return sum;
    }

    public static void main(String args[]) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //1. n으로 시작하는 무한 수열 돌려보기 (1~10000)
        //2. 무한 수열 돌리면서 생성자 있는 수 hashset에 저장 (중복허용X)
        //3. hashset 반복문 돌려서 일치하지 않은 수 출력
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i=1; i<=10000; i++){ //1
            int sum = d(i);
            if(sum <= 10000){
                hs.add(sum); //2
            }
        }

        for(int i=1; i<=10000; i++){ //3
            if(!hs.contains(i)){
                bw.write(i + "\n");
            }
        }
        bw.flush(); bw.close();
    }

}
