import java.io.*;

public class No_1068 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n>=90){
            System.out.print("A");
        }else if(n>=70){
            System.out.print("B");
        }else if(n>=40){
            System.out.print("C");
        }else{
            System.out.print("D");
        }

        br.close();
    }
}