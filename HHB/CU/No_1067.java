import java.io.*;

public class No_1067 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n > 0){
            System.out.println("plus");
        }else{
            System.out.println("minus");
        }

        if(n % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        br.close();
    }
}