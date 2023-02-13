package HHB.BJ;
import java.io.*;
import java.util.*;

public class No_1152 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            st.nextToken();
            count++;
        }
        System.out.println(count);
//        System.out.print(st.countTokens()); //StringTokenizer의 함수
        br.close();
    }
}