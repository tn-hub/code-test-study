import java.io.*;
import java.util.StringTokenizer;

public class No_1094 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //출석 부른 횟수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] check = new int[n];
        for(int i=0; i<n; i++){
            check[i] = Integer.parseInt(st.nextToken());
        }

        int[] num = new int[n];
        for(int i=n; i>=1; i--){
            num[i-1] = check[n-i];
        }

        for(int i : num){
            System.out.print(i + " ");
        }

        br.close();
    }
}