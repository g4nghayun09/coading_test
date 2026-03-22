import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println(num1+num2-num3);
        System.out.println(Integer.parseInt(Integer.toString(num1)+Integer.toString(num2))-(num3));

    }
}