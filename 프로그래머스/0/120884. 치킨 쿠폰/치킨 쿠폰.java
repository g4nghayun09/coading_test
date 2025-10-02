class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int service = 0;
        while(true) {
            service = coupon/10;
            answer+=service;
            coupon = service+(coupon%10);
            if(coupon<10)
                break;
        }
        return answer;
    }
}