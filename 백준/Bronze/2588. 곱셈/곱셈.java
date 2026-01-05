import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        String num2 = scan.next();

        for(int i=2; i>=0; i--){
            char ch = num2.charAt(i);
            System.out.println(num1 * (ch-48));
        }
        System.out.println(num1 * Integer.parseInt(num2));
    }
}