class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int dis = 0;
        for(int i=0; i<dic.length; i++){
            dis = 0;
                for(int j=0; j<spell.length; j++){
                    if(dic[i].contains(spell[j])){
                        dic[i] = dic[i].replaceFirst(spell[j], "");
                        dis++;
                    }
                    else
                        break;
                }
                if(dis==spell.length){
                    answer = 1;
                    break;
                }
                    
        }
        
        return answer;
    }
}