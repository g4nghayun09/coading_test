class Solution {
    public int solution(double price) {
       double answer = 0;
        if(100000<=price&&price<300000)
            answer = price-(price*5/100);
        else if(300000<=price&&price<500000)
            answer = price-(price*10/100);
        else if(500000<=price)
            answer = price-(price*20/100);
        else
            answer = price;
     
        return (int)answer;
    }
}