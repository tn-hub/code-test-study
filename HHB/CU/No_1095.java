import java.io.*;
import java.util.StringTokenizer;

public class No_1095 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //출석 부른 횟수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] check = new int[n];
        for(int i=0; i<n; i++){
            check[i] = Integer.parseInt(st.nextToken());
        }

        int result = check[0];
        for(int i=0; i<n; i++){
            result = (result<check[i]? result : check[i]);
        }

        System.out.print(result);

        br.close();
    }
}