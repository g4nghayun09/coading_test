import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int FirstL = (A+B)%C;
        int SecondL = ((A%C) + (B%C))%C;
        int ThirdL = (A*B)%C;
        int FourL = ((A%C) * (B%C))%C;

        System.out.println(FirstL);
        System.out.println(SecondL);
        System.out.println(ThirdL);
        System.out.println(FourL);
    }
}