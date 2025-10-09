class Solution {
    fun solution(balls: Int, share: Int): Int {
        var result = 1L
        for (i in 1..share) {
            result = result * (balls - i + 1) / i
        }
        return result.toInt()
    }
}