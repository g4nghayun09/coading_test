import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.next());

        for(int i=0; i<count; i++) {
            int num = Integer.parseInt(scan.next());
            String str = scan.next();
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                for(int k=0; k<num; k++){
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}