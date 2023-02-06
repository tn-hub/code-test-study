package HHB.BJ;
import java.io.*;
import java.util.StringTokenizer;

public class No_2675 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); //입력받을 횟수

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String str[] = {st.nextToken(), st.nextToken()};
            int r = Integer.parseInt(str[0]);

            for(int k=0; k<str[1].length(); k++){
                for(int j=0; j<r; j++){
                    System.out.print(str[1].charAt(k));
                }
            }
            System.out.println();
        }
        br.close();
    }
}
