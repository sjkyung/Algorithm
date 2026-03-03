class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
            return numlist.sortedWith(
            compareBy<Int> { kotlin.math.abs(it - n) }
                .thenByDescending { it }
            ).toIntArray()
    }
}