import java.util.*;

public class Solution {
    public int[] solution(int []arr){
        
        int cnt=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]!=arr[i]){
                cnt++;
            }
        }
        int answer[] = new int[cnt];
        //위의 코드가 배열 방잡는 거임
        answer[0] = arr[0];
        int num=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]!=arr[i]){
                answer[num] = arr[i];
                num++;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        return answer;
    }
}