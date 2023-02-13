import java.io.*;

public class No_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26]; // 영문자 26개 0 초기화
        String str = br.readLine().toUpperCase();

        for (int i = 0; i < str.length(); i++) { // 갯수저장
            char c = str.charAt(i);
            arr[c - 65]++; // 'A' 65
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if(arr[i] > max){ // max 에 저장
                max = arr[i];
                ch = (char)(i + 65);
            } else if (arr[i] == max) { // 같은 수 존재
                ch = '?';
            }
        }
        bw.write(ch + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
