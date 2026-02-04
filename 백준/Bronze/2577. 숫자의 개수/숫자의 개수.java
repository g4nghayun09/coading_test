import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        long gop = num1 * num2 * num3;
        String str = Long.toString(gop);
        char ch;
        int[] arr = new int[10];

        for(int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            arr[ch-48]++;
        }


        for(int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }

    }
}