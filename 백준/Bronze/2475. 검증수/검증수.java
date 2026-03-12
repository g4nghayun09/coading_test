
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        for(int i=0; i<num.length; i++) {
            num[i] = scan.nextInt();
            sum += num[i]*num[i];
        }
        sum %= 10;
        System.out.println(sum);
    }
}