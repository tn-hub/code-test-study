package HHB.BJ;

import java.io.*;
public class No_2775 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 데이터 수

        //0층 i호 = i명
        //001-1 │ 002-2 003-3  004-4
        //────────────────────────────
        //101-1 │ 102-3 103-6  104-10
        //201-1 │ 202-4 203-10 204-20
        //301-1 │ 302-5 303-15 304-35

        int[][] arr = new int[15][15];
        for(int j=0; j<15; j++){
            arr[j][1] = 1; //001-1 101-1 201-1 301-1
            arr[0][j] = j; //001-1 002-2 003-3 004-4
        }

        for(int i=0; i<T; i++){
            int k = Integer.parseInt(br.readLine()); //층
            int n = Integer.parseInt(br.readLine()); //호

            for(int a=1; a<=k; a++){
                for(int b=2; b<=n; b++){
                    arr[a][b] = arr[a][b-1] + arr[a-1][b];
                }
            }
            System.out.println(arr[k][n]);
        }

        br.close();
    }
}
