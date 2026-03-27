import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> list = new HashSet<>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                list.add(numbers[i]+numbers[j]);
            }
        }
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}