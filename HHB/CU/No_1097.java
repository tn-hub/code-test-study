import java.io.*;
import java.util.StringTokenizer;

public class No_1097 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[19][19];

        for(int i=0; i<19; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<19; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int n = Integer.parseInt(br.readLine()); //횟수
        int x = 0, y = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken())-1;
            y = Integer.parseInt(st.nextToken())-1;

            for(int j=0; j<19; j++){
                if(arr[x][j] == 0){
                    arr[x][j] = 1;
                }else{
                    arr[x][j] = 0;
                }
            }
            for(int j=0; j<19; j++){
                if(arr[j][y] == 0){
                    arr[j][y] = 1;
                }else{
                    arr[j][y] = 0;
                }
            }
        }

        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}