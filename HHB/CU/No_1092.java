import java.io.*;
import java.util.StringTokenizer;

public class No_1092 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int day = 1; //날짜는 1부터 시작

        while(day % a != 0 || day % b != 0 || day % c != 0){
            day++;
        }
        System.out.print(day);

        br.close();
    }
}