import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0; i<num; i++) {
            for(int k=0; k<i; k++) {
                System.out.print(" ");
            }
            for(int j=0; j<2*(num-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=num; i++) {
            for(int k=0; k<num-i; k++) {
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}