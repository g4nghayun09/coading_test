import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] length = new int[3];

        while(true) {
            length[0] = scan.nextInt();
            length[1] = scan.nextInt();
            length[2] = scan.nextInt();
            if(length[0]==0 && length[1]==0 && length[2]==0)
                break;
            Arrays.sort(length);
            // 큰수 찾기
            int max = length[2];
            int small1 = length[1];
            int small2 = length[0];

            // 제곱해서 판단하기
            if((max*max)==(small2*small2)+(small1*small1))
                System.out.println("right");
            else
                System.out.println("wrong");

        }
    }
}