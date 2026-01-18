import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = Integer.parseInt(scan.nextLine());
        String strArr = scan.nextLine();
        String[] numArr = strArr.split(" ");
        int answer = Integer.parseInt(scan.nextLine());
        int count = 0;
        for(int i=0; i<cnt; i++){
            if(Integer.parseInt(numArr[i])==answer)
                count++;
        }
        System.out.println(count);
    }
}