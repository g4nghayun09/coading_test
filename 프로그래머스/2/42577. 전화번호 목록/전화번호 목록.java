import java.util.*;

class Solution {
    public boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);
        for(int i=0; i<phoneBook.length-1; i++) {
            if(phoneBook[i+1].indexOf(phoneBook[i])==0)
                return false;
        }
        return true;
    }
}