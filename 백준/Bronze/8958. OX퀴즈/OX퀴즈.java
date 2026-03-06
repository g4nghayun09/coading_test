
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String str = "";
        int answer = 0;
        int pluse = 1;


        for(int i=0; i<num; i++) {
            str = scan.nextLine();
            answer=0;
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                if(ch == 'O') {
                    answer+=pluse;
                    pluse++;
                } else if(ch=='X') {
                    pluse = 1;
                }
            }
            pluse=1;
            System.out.println(answer);
        }
    }
}