class Solution {
    fun solution(n: Int): Int {
        var count = 0
        var num = 0

        while (count < n) {
            num++
            if (num % 3 != 0 && !num.toString().contains("3")) {
                count++
            }
        }

        return num
    }
}