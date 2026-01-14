import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        while(true){
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            if(num1==0&&num2==0){
                break;
            }
            int sum = num1 + num2;
            System.out.println(sum);
        }
    }
}