class Solution {
    fun solution(dots: Array<IntArray>): Int {
        fun isParallel(a: IntArray, b: IntArray, c: IntArray, d: IntArray): Boolean {
        return (b[1] - a[1]) * (d[0] - c[0]) ==
               (d[1] - c[1]) * (b[0] - a[0])
        }

        return if (
            isParallel(dots[0], dots[1], dots[2], dots[3]) ||
            isParallel(dots[0], dots[2], dots[1], dots[3]) ||
            isParallel(dots[0], dots[3], dots[1], dots[2])
        ) 1 else 0
    }
}