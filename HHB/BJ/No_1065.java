package HHB.BJ;
import java.io.*;
public class No_1065 {
    public static int countHan(int N){
        //1. 1~99 까지는 모두 한수
        //2. 100부터는 식만들어서 구하기

        int count = 0; //한수의 개수
        for(int i=1; i<=N; i++){ //1부터 시작!
            if(i<100){ //1
                count++;
            }
            else{ //2
                int a = i/100;
                int b = (i/10)%10;
                int c = (i%100)%10;

                if((a-b) == (b-c)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        bw.write(countHan(Integer.parseInt(br.readLine())) + "\n");

        bw.flush(); bw.close(); br.close();
    }
}
