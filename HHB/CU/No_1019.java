import java.io.*;
import java.util.StringTokenizer;

public class No_1019 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");

        String year = st.nextToken();
        String month = st.nextToken();
        String day = st.nextToken();

        if(year.length() == 2){
            year = "00" + year;
        }
        if(month.length() == 1){
            month = "0" + month;
        }
        if(day.length() == 1){
            day = "0" + day;
        }

        System.out.print(year + "." + month + "." + day);

        br.close();
    }
}