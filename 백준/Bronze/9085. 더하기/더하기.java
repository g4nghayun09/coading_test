import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0; i<num; i++) {
            int few = scan.nextInt();
            int sum = 0;
            for(int j=0; j<few; j++) {
                int n = scan.nextInt();
                sum += n;
            }
            System.out.println(sum);
        }
    }
}