import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int answer = 0;
        for(int i=1; i<=num; i++){
            answer += i;
        }
        System.out.print(answer);
    }
}