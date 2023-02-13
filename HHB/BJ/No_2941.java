package HHB.BJ;
import java.io.*;

public class No_2941 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("");
        int count = 0;

        for(int i=0; i<str.length; i++){
            if(str[i].equals("c") || str[i].equals("s") || str[i].equals("z") && i+1 < str.length){
                if(i+1 < str.length){
                    if(str[i+1].equals("=") || str[i+1].equals("-")) i++;
                }
            }
            else if(str[i].equals("d") && i+1 < str.length){
                if(str[i+1].equals("z")){
                    if(i+2 < str.length){
                        if(str[i+2].equals("=")) i+=2;
                    }
                }
                else if(str[i+1].equals("-")) i++;
            }
            else if(str[i].equals("l") || str[i].equals("n") && i+1 < str.length){
                if(str[i+1].equals("j")) i++;
            }

            count++;
        }
        System.out.print(count);

        br.close();
    }
}