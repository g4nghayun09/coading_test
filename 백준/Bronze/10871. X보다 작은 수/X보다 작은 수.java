import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int num1 = scan.nextInt();
        int cnt = 0;
        int num;
        for(int i=0; i<count; i++){
            num = scan.nextInt();
            if(num1>num)
                System.out.print(num+" ");
        }
    }
}