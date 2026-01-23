import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuffer sbStr1 = new StringBuffer(scan.next());
        StringBuffer sbStr2 = new StringBuffer(scan.next());

        System.out.println(Math.max(Integer.parseInt(sbStr1.reverse().toString()), Integer.parseInt(sbStr2.reverse().toString())));
    }
}