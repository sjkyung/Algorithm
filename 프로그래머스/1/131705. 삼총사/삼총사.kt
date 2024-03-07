class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        
        
        for(i in 0 until number.size){
            for(a in i+1 until number.size step 1){
                for(b in a+1 until number.size step 1){
                    if(number[i]+number[a]+number[b] === 0) answer++
                }
            }
        }
        
        
        return answer
    }
}