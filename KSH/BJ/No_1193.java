import java.io.*;

public class No_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int i = 0;
        String result = "";

        while (true) {
            i++;
            cnt+=i;
            if(cnt >= n){
                if(i%2 == 0){ // 짝수
                    result = (n-cnt+i) + "/"+(cnt-n+1);
                } else { // 홀수
                    result = (cnt-n+1) + "/"+(n-cnt+i);
                }
                break;
            }
        }
        bw.write(result);

        br.close();
        bw.flush();
        bw.close();
    }
}
/*
분수 찾기
1/1  1/2  1/3  1/4  1/5  …
2/1  2/2  2/3  2/4  …	   …
3/1  3/2  3/3  …    …    …
4/1  4/2  …	 …    …	   …
5/1  …	…    …	  …    …

행(분모 분자합)
1(2)   1/1
2(3)   2/1 1/2
3(4)   3/1 2/2 1/3
*/
