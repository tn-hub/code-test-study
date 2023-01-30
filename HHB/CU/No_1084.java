import java.io.*;
import java.util.StringTokenizer;

public class No_1084 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int count = n*m*r;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int k=0; k<r; k++){
                    bw.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bw.write(String.valueOf(count));

        br.close(); bw.flush(); bw.close();
    }
}