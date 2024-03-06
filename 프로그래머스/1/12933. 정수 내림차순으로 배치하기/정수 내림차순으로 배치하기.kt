class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
       
        var digit = n.toString().toCharArray().map{it.toString().toInt()}.sortedDescending()
        answer = digit.joinToString("").toLong()
        
        return answer
    }
}