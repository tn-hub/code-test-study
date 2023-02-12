package HHB.BJ;
import java.io.*;

public class No_1316 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //입력 받을 그룹 단어의 개수
        int count = n; //그룹단어의 개수

        for(int i=0; i<n; i++){
            boolean[] chk = new boolean[26]; //false로 초기화되어있음
            String str = br.readLine();

            for(int j=0; j<str.length(); j++){
                if(j==0){
                    chk[str.charAt(j)-'a'] = true;
                }
                else{
                    if(str.charAt(j-1)==(str.charAt(j))){
                        break;
                    }
                    else{
                        if(!chk[str.charAt(j)-'a']){
                            chk[str.charAt(j)-'a'] = true;
                        }
                        else{
                            count--;
                            break;
                        }
                    }
                }
            }
        }

        System.out.print(count);

        br.close();
    }
}