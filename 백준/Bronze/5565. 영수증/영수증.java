import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPrice = scan.nextInt();

        for(int i=0; i<9; i++) {
            totalPrice -= scan.nextInt();
        }
        System.out.println(totalPrice);
    }
}