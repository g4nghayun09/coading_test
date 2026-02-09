import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt;
        while(true) {
            String sc = scan.nextLine();
            String str = sc.toLowerCase();
            cnt = 0;
            if(str.equals("#"))
                break;
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                switch(ch) {
                    case 'a' : cnt++; break;
                    case 'e' : cnt++; break;
                    case 'i' : cnt++; break;
                    case 'o' : cnt++; break;
                    case 'u' : cnt++; break;
                }
            }
            System.out.println(cnt);
        }
    }
}