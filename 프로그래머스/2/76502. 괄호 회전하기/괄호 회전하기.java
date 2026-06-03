import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> stk = new ArrayDeque<>();

        // 초기 세팅
        for (char c : s.toCharArray()) {
            stk.addLast(c);
        }

        for (int i = 0; i < s.length(); i++) {

            Deque<Character> gwalho = new ArrayDeque<>();
            boolean isValid = true;

            // 회전
            stk.addLast(stk.pollFirst());

            for (char c : stk) {

                // 여는 괄호
                if (c == '(' || c == '{' || c == '[') {
                    gwalho.push(c);
                } 
                // 닫는 괄호
                else {
                    if (gwalho.isEmpty()) {
                        isValid = false;
                        break;
                    }

                    char top = gwalho.peek();

                    if ((top == '(' && c == ')') ||
                        (top == '{' && c == '}') ||
                        (top == '[' && c == ']')) {
                        gwalho.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && gwalho.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}