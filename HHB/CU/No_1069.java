import java.io.*;

public class No_1069 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String grade = br.readLine();

        switch(grade){
            case "A" :
                System.out.print("best!!!");
                break;
            case "B" :
                System.out.print("good!!");
                break;
            case "C" :
                System.out.print("run!");
                break;
            case "D" :
                System.out.print("slowly~");
                break;
            default :
                System.out.print("what?");
        }

        br.close();
    }
}