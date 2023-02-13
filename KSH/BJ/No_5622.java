import java.io.*;

public class No_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        int totalTime = 0;
        for (char c: arr) {
            totalTime += getTelMinTime(c);
        }
        bw.write(totalTime + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static int getTelMinTime(char c) {
        int result = 1;

        if('A' <= c && c <= 'C') {
            result = 2;
        } else if (c <= 'F') {
            result = 3;
        } else if (c <= 'I') {
            result = 4;
        } else if (c <= 'L') {
            result = 5;
        } else if (c <= 'O') {
            result = 6;
        } else if (c <= 'S') {
            result = 7;
        } else if (c <= 'V') {
            result = 8;
        } else if (c <= 'Z') {
            result = 9;
        } else {
            result = 10;
        }

        return result+1;
    }
}
