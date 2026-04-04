import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            boolean boo = false;
            for(int j=0; j<stk.size(); j++) {
                if(stk.get(j)==arr[i]){
                    boo = true;
                    break;
                }  
            }
            if(!boo) {
                stk.push(arr[i]);
            }
            if(stk.size()==k)
                break;
        }
        System.out.println(stk.size());
        for(int i=0; i<stk.size(); i++) {
            answer[i] = stk.get(i);
        }
        if(stk.size()<k){
            for(int i=stk.size(); i<answer.length; i++) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}