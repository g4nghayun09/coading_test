class Solution {
    public int solution(int a, int b, int n) {
        int receive = 0;
        while(n>=a) {
            int now = (n/a)*b;
            receive += (n/a)*b;
            n = (n%a) + now;
        }
        return receive;
    }
}