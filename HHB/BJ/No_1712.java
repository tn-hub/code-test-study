package HHB.BJ;
import java.io.*;
import java.util.*;
public class No_1712 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()); //고정비용
        int b = Integer.parseInt(st.nextToken()); //가변비용
        int c = Integer.parseInt(st.nextToken()); //노트북 가격

        if(b >= c){ //가변비용 >= 노트북가격 이면 손익분기점 없음
            System.out.print("-1");
        }
        else{ //노트북 가격 - 가변비용 => 판매액
            System.out.print(a/(c-b) + 1);
        }

        br.close();
    }
}
