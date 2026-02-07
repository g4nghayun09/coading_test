import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch<=90 && ch>=65)
                ch += 32;
            else
                ch -= 32;
            answer += ch;
        }
        System.out.println(answer);
    }
}