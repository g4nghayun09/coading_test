import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            String num1 = scan.next();
            String num2 = scan.next();

            System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
        }
    }
}