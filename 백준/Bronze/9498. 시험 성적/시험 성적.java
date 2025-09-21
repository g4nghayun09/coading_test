import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>=90&&a<=100)
            System.out.print("A");
        else if(a>=80&&a<=89)
            System.out.print("B");
        else if(a>=70&&a<=79)
            System.out.print("C");
        else if(a>=60&&a<=69)
            System.out.print("D");
        else
            System.out.print("F");
    }
}