class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        
        val str = n.toString()
        for(c in str){
            answer += c.digitToInt()
        }
        
        return answer
    }
}