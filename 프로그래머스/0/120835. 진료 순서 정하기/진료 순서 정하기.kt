class Solution {
    fun solution(emergency: IntArray): IntArray {
        val sorted = emergency.sortedDescending()
        return emergency.map { sorted.indexOf(it)+1 }.toIntArray()
    }
}