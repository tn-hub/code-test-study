import java.io.*;

public class No_1066 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(" ");

        for(int i=0; i<num.length; i++){
            if(Integer.parseInt(num[i])%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }

        br.close();
    }
}