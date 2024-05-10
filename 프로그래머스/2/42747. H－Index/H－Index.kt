class Solution {
    fun solution(citations: IntArray): Int {
        citations.sortDescending()
        return citations.withIndex()
            .firstOrNull { it.value < it.index + 1 }?.index ?: citations.size
    }
}