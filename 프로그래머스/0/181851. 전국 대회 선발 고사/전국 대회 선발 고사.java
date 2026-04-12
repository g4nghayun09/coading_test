import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<attendance.length; i++) {
            if(attendance[i])
                stk.push(i);
        }
        Integer[] arr = new Integer[stk.size()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = stk.get(i);
        }
        Arrays.sort(arr, (a, b) -> rank[a] - rank[b]);
        answer = 10000 * arr[0] + 100 * arr[1] + arr[2];
        return answer;
    }
}