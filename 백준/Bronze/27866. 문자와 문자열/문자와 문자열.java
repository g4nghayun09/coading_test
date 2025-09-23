import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String answer = "";
        String str = scan.nextLine();
        int A = scan.nextInt();
        char temp = str.charAt(A-1);
        answer += temp;
        System.out.print(answer);
    }
}