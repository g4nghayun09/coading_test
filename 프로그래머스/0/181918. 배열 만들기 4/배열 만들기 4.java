// arraylist로 stack을 함. 
// 조건들을 가지고 .add, .remove()하면됨.
// 그리고 그것들을 배열로 이동

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> list = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!list.isEmpty() && list.peek()>=arr[i]) {
                list.pop();
            }
            list.push(arr[i]);
        }
        int[] stk = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            stk[i] = list.get(i);
        }
        return stk;
    }
}