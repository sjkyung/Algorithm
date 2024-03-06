class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        var min = arr.minOrNull()!!
        answer = arr.filter{it != min}.toIntArray()
        if(answer.isEmpty()){
            return intArrayOf(-1)
        }
        
        return answer
    }
}