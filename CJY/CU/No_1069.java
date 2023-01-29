import java.io.*;

public class No_1069 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        switch(br.readLine()) {
            case "A":
                bw.write("best!!!");
                break;
            case "B":
                bw.write("good!!");
                break;
            case "C":
                bw.write("run!");
                break;
            case "D":
                bw.write("slowly~");
                break;
            default:
                bw.write("what?");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}