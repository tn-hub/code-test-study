import java.io.*;
import java.util.StringTokenizer;

public class No_1098 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        int arr[][] = new int[h][w];

        for(int i=0; i<n; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int l = Integer.parseInt(st1.nextToken());
            int d = Integer.parseInt(st1.nextToken());
            int x = Integer.parseInt(st1.nextToken())-1;
            int y = Integer.parseInt(st1.nextToken())-1;

            if(d == 0){
                for(int j=y; j<y+l; j++){
                    arr[x][j] = 1;
                }
            }else{
                for(int j=x; j<x+l; j++){
                    arr[j][y] = 1;
                }
            }
        }

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}