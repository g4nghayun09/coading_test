class Solution {
    public int solution(int a, int b) {
        int answer = 2;//거짓
        int temp = 0;
        //최대공약수
        for(int i=1; i<=a; i++){
            if(a%i==0&&b%i==0){
                temp=i;
            }
        }
        a /= temp;
        b /= temp;
        System.out.print(b);
        while(b % 2 == 0) b /= 2;
        while(b % 5 == 0) b /= 5;
        if(b == 1) answer = 1; // 유한소수
        else answer = 2;        // 무한소수
        
        return answer;
    }
}