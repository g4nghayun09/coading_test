class Solution {
    public String solution(int[] food) {
        String answer = "";
        int[] processFood = new int[food.length];
        processFood[0] = 1;
        for(int i=1; i<food.length; i++) {
            if(food[i]%2==1) {
                food[i]--;
            }
            processFood[i] = food[i];
        }
        
        for(int i=1; i<processFood.length; i++) {
            for(int j=0; j<processFood[i]/2; j++) {
                answer += i;
            }
        }
        answer += "0";
        for(int i=processFood.length-1; i>=1; i--) {
            for(int j=0; j<processFood[i]/2; j++) {
                answer += i;
            }
        }
        return answer;
    }
}