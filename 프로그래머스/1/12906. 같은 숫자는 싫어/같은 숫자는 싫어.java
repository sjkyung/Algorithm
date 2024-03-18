import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> temList = new ArrayList<>();
        
        int pre = arr[0];
        temList.add(pre);
        
        
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != pre){
                temList.add(arr[i]);
                pre = arr[i];
            }
        }
        

        int[] answer = new int[temList.size()];
        for (int i = 0; i < temList.size(); i++) {
            answer[i] = temList.get(i);
        }

        return answer;
    }
}