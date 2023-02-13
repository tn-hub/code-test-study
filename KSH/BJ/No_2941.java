import java.io.*;

public class No_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String str = br.readLine();

        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            if(str.contains(temp)){
                str = str.replace(temp, "0");
            }
        }
        bw.write(str.length()+ "");

        br.close();
        bw.flush();
        bw.close();
    }
}
