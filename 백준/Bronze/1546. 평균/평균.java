import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] num = new int[count];
        double sum = 0;
        int max = 0;

        for(int i=0; i<count; i++) {
            num[i] = scan.nextInt();
        }
// 최댓값 찾기.
        for(int i=0; i<count; i++) {
            if(max<num[i])
                max = num[i];
        }
        // 계산하기
        for(int i=0; i<count; i++) {
            sum += ((double)num[i]/max) * 100;
        }

        System.out.println((sum/count));
    }
}