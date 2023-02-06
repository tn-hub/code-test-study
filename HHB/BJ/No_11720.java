package HHB.BJ;
import java.io.*;
public class No_11720 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        int sum = 0;

        for(String s : str){
            sum += Integer.parseInt(s);
        }

        System.out.print(sum);
    }
}
