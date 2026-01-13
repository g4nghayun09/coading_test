import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int num1, num2;

        for(int i=0; i<count; i++) {
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            int sum = num1 + num2;
            System.out.println("Case #" + (i + 1) + ": "+num1+" + "+num2+" = "+ sum);
        }
    }
}