package HHB.BJ;
import java.io.*;

public class No_10809 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] i1 = new int[26]; //초기화
        for(int i=0; i<26; i++){
            i1[i] = -1;
        }

        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            int seq = ch-97;
            //arr[2]이 알파벳'c' => arr[x]의 x가 알파벳의 순서
            //i의 값은 읽은 문자열 S의 문자순서 => arr[]의 바뀌어질 숫자(순서)가 됨
            //'c'가 첫번째 글자라면 arr[2] = i = 0 이 됨
            //아스키코드 숫자 97=='a' => ch가 'a'일때 seq=0이어야함

            if(i1[seq] == -1){ //-1일때만 숫자바꿈 (처음 등장하는 위치만 저장해야해서)
                i1[seq] = i;
            }
        }

        for(int item : i1){
            System.out.print(item + " ");
        }
        br.close();
    }
}
