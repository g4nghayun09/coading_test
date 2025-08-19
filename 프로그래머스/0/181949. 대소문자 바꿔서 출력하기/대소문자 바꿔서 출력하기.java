import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String answer = "";
        for(int i=0; i<str.length(); i++){
            char temp = str.charAt(i);
            if(temp >= 65&&temp<=90)
                temp+=32;
            else
                temp-=32;
            answer += temp;
        }
        System.out.print(answer);
    }
}