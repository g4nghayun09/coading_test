import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num1 = scan.nextLong();
        long num2 = scan.nextLong();

        long num = num1;
        long i = 1;
        while(true) {
            if(num1%num2==0)
                break;
            num1 = num*i;
            i++;
        }
        System.out.println(num1);

    }
}