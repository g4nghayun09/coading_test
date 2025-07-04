class Solution {
    public int solution(int[] numbers) {
        int answer = 10000 * -10000;
        int min = 10000 * -10000;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(numbers[i]*numbers[j]>answer&&i!=j)
                    answer = numbers[i]*numbers[j];
                // else
                //     if(numbers[i]*numbers[j]<min&&i!=j)
                //         min = numbers[i]*numbers[j];
            }
        }
        // if(answer == 0)
        //     answer = min;
        return answer;
    }
}