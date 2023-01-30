import java.util.*;

public class No_1096 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //올려놓을 흰 돌의 개수
        int[][] arr = new int[19][19];

        for(int i=0; i<arr.length; i++){ //바둑판 초기화
            for(int j=0; j<arr.length; j++){
                arr[i][j] = 0;
            }
        }

        for(int i=0; i<n; i++){
            arr[sc.nextInt()-1][sc.nextInt()-1] = 1;
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}