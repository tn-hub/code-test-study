import java.io.*;
import java.util.StringTokenizer;

public class No_1099 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[][] = new int[10][10];

       for(int i=0; i<10; i++){
           StringTokenizer st = new StringTokenizer(br.readLine(), " ");
           for(int j=0; j<10; j++){
               arr[i][j] = Integer.parseInt(st.nextToken());
           }
       }

       int x=1, y=1;

       while(true){
           if(arr[x][y] == 2){
               arr[x][y] = 9;
               break;
           }
           arr[x][y] = 9;
           if(arr[x][y+1] == 0 || arr[x][y+1] == 2){
               y++;
               continue;
           }else if(arr[x][y+1] == 1){
               if(arr[x+1][y] == 0 || arr[x+1][y] == 2){
                   x++;
                   continue;
               }else if(arr[x+1][y] == 1){
                   break;
               }
           }
       }

       for(int i=0; i<10; i++){
           for(int j=0; j<10; j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }

        br.close();
    }
}