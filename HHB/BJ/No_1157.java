package HHB.BJ;
import java.io.*;
public class No_1157 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] count = new int[26];

        //A==65, a==97
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){ //대문자 일때
                count[str.charAt(i)-'A']++; //count[] 는 0~25 -> A는 0번째
            }
            else{
                count[str.charAt(i)-'a']++;
            }
        }

        int maxInt = -1;
        char maxChar = '?';
        for(int i=0; i<26; i++){
            if(count[i] > maxInt){
                maxInt = count[i];
                maxChar = (char)(i+65); //출력할 대문자
            }
            else if(count[i] == maxInt){
                maxChar = '?'; //같으면 ? 출력
            }
        }
        System.out.print(maxChar);

        br.close();
    }
}
