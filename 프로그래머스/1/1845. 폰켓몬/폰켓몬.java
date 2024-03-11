import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2; 
        HashSet<Integer>  hashset = new HashSet<>();
        
        for(int n : nums){
            hashset.add(n);
            
        }
        
        if(max >=  hashset.size()){
            return hashset.size();
        }else{
            return max;
        }
        
        
        
        
      
    }
}