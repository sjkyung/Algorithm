class Solution {
    fun solution(array: IntArray): Int {
        return array.joinToString("").count { it == '7' } 
    }
}