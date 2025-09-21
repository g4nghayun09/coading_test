import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a>0&&b>0)
            System.out.print(1);
        if(a<0&&b>0)
            System.out.print(2);
        if(a<0&&b<0)
            System.out.print(3);
        if(a>0&&b<0)
            System.out.print(4);
    }
}