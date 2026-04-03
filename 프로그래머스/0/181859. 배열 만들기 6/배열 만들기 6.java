// i의 초깃값을 0
// 만약 arr의 길이가 작으면 반복
    // stk가 빈배열이면 arr[i]를 추가
    // stk 원소가 있고, 마지막원소가 arr[i]와 같으면 마지막 제거 i++
    // 위의 경우가 아닐 경우 arr[i]추가 ㅑi--

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<arr.length; i++) { 
            if(stk.isEmpty())
                stk.push(arr[i]);
            else if(stk.peek()==arr[i]){
                stk.pop();
            } 
            else {
                stk.push(arr[i]);
            }
        } 
        
        int[] answer = new int[stk.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = stk.get(i);
        }
        if(answer.length==0) {
            int[] otherAns = new int[1];
            otherAns[0] = -1;
            return otherAns;
        }
        return answer;
        
    }
}