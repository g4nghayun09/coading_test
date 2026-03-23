import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        BigInteger num1 = new BigInteger(str);

        str = scan.next();
        BigInteger num2 = new BigInteger(str);

        System.out.println(num1.add(num2));
    }
}