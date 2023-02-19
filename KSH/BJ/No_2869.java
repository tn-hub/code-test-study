import java.io.*;

public class No_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]); // 낮 +
        int B = Integer.parseInt(str[1]); // 밤 -
        int V = Integer.parseInt(str[2]); // 나무 높이

        int day = (V - B) / (A - B);
        if((V - B)% (A - B) != 0){
            day++;
        }
        bw.write(day+"");

//        int n = 1; // day
//        int total = 0;
//        while (total <= V){
//            if(n > 1) {
//                total-= B;
//                if(total-B < V){ // 밤 반영
//                    if(total+A >= V){
//                        break;
//                    } else {
//                        total += A;
//                        n++;
//                    }
//                } else {
//                    break;
//                }
//            } else {
//                if(A >= V){
//                    break;
//                } else {
//                    total += A;
//                    n++;
//                }
//            }
//        }
//        bw.write(n+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
