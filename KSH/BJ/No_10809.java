import java.io.*;

public class No_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine(); // baekjoon
        int a = (int)'a';
        int z = (int)'z';
        int[] arr = new int[z-a+1];
        for (int i = 0; i < arr.length; i++) { // a b c
            arr[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) { // a b c
            char c = (char)(i+'a');
            arr[i] = -1;
            for (int j = 0; j < str.length(); j++) { // b
                char x = str.charAt(j);
                if(arr[i] == -1 && c == x){
                    arr[i] = j;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
