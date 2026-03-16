
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int[] numList = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            numList[i] += ch-48;
        }

        Arrays.sort(numList);
        for(int i=numList.length-1; i>=0; i--) {
            System.out.print(numList[i]);
        }

    }
}