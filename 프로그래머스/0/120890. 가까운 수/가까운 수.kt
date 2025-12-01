class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var closest = array[0]
        var minDiff = kotlin.math.abs(array[0] - n)

        for (num in array) {
            val diff = kotlin.math.abs(num - n)
            if (diff < minDiff || (diff == minDiff && num < closest)) {
                minDiff = diff
                closest = num
            }
        }
        return closest
    }
}