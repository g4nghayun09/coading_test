import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scan.next());
        BigInteger num2 = new BigInteger(scan.next());

        num1 = num1.add(num2);

        System.out.println(num1);

    }
}