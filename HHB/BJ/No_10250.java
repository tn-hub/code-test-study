package HHB.BJ;

import java.io.*;
import java.util.StringTokenizer;
public class No_10250 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 데이터 수

        StringTokenizer st;

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int H = Integer.parseInt(st.nextToken()); //호텔의 층 수
            int W = Integer.parseInt(st.nextToken()); //각 층의 방 수
            int N = Integer.parseInt(st.nextToken()); //몇 번째 손님

            //출력해야 하는것 : N번째 손님에게 배정되는 방의 번호
            if(N % H == 0){
                System.out.println((H*100) + (N/H));
            }
            else{
                System.out.println(((N/H)*100) + ((N/H)+1));
            }
        }

        br.close();
    }
}
