import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch);
            if((i+1)%10==0)
                System.out.println();
        }
    }
}