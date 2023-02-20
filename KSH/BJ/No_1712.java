import java.io.*;

public class No_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]); // 고정비용(1회)
        int B = Integer.parseInt(str[1]); // 가변비용(1대 제작비용)
        int C = Integer.parseInt(str[2]); // 가격(1대 판매금액)
        long n = 0;
        if(B >= C){
            n = -1;
        } else {
            n = (A/(C-B))+1;
//            long totalCost = 0; // 총 비용
//            long totalIncome= 0; // 총 수입
//            while (true){
//                totalCost = A + B * n;
//                totalIncome= C * n;
//                if(totalCost < totalIncome){
//                    break;
//                } else {
//                    n++;
//                }
//            }
        }
        bw.write(n + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
