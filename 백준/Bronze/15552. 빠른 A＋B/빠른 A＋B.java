import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bwriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(buffer.readLine());

        for(int i=0; i<count; i++) {
            StringTokenizer st = new StringTokenizer(buffer.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            String sum = Integer.toString(num1 + num2);

            bwriter.write(sum);
            bwriter.newLine();
        }

        bwriter.flush();
        bwriter.close();
        buffer.close();

    }
}