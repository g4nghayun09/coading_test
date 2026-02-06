import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        for(int i=0; i<length; i++) {
            String str = scan.next();
            String[] arr = str.split(",");
            int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            System.out.println(sum);
        }
    }
}