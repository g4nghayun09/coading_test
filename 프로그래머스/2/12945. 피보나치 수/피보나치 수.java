import java.math.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("1");
        BigInteger sum = new BigInteger("1");
        for(int  i=2; i<n; i++) {
            sum = num1.add(num2);
            num1 = num2;
            num2 = sum;
        } 
        answer = (num2.remainder(BigInteger.valueOf(1234567))).intValue();
        return answer;
    }
}