import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i=0; i<num; i++) {
//            공백
            for(int k=num-1; k>i; k--) {
                System.out.print(" ");
            }
//            찍는 거
            for(int j=-1; j<=i*2-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}