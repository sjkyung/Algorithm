import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;    
       
        for(int i =0; i < sizes.length; i++){
           int  max1 = Math.max(sizes[i][0],sizes[i][1]);
           int  min1 = Math.min(sizes[i][0],sizes[i][1]);
            max = Math.max(max,max1);
            min = Math.max(min,min1);
        }
        
        
        
        return answer = max * min;
    }
}