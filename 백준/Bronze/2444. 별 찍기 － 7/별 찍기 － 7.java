import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for(int i=0; i<count; i++){
            for(int k=count-1; k>i; k--){
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<count-1; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(" ");
            }

            for(int j=count-1; j>i; j--) {
                System.out.print("*");
            }

            for(int j=count-2; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}