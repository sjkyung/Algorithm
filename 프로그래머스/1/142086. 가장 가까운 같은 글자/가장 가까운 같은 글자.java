import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastSeen = new HashMap<>();
        
        
        for(int i=0; i < s.length(); i++){
            char a =  s.charAt(i);
            
            if(lastSeen.containsKey(a)){
                answer[i] = i - lastSeen.get(a);
            }else{
                answer[i] = -1;
            }
            lastSeen.put(a,i);
        }
        
        
        
        
        return answer;
    }
}