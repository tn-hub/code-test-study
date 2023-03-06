package KSH.BJ;

import java.io.*;

public class No_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;
            int num = Integer.parseInt(arr[i]);
            if(num == 1) {	// 1 인경우 다음 반복문으로
                continue;
            }
            for(int j = 2; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    isPrime = false;	// 소수가 아니므로 false 로 바꿔줌
                    break;
                }
            }
            if(isPrime) {	// 소수인경우 count 값 1 증가
                cnt++;
            }
        }
        bw.write(cnt+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
/*
소수
: 1 과 자기 자신만을 약수로 갖는수
판별법
1.판별하려는 수 직전까지 하나씩 나눠보면서 나누어 떨어지는 수가 없다면 소수(시간복잡도는 O(N)->O(N²))
2.소수를 판별할 때 Number 의 제곱근 까지만 검사(시간 복잡도는 O(√N))
3.에라토스테네스의 체(시간 복잡도는 O(n ㏒ (㏒ n)), 1 ~ N 까지의 수 중 모든 소수를 구할 때)
 */