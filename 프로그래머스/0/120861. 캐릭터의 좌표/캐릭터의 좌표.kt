class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var x = 0
        var y = 0

        val maxX = board[0] / 2
        val maxY = board[1] / 2

        for (key in keyinput) {
            when (key) {
                "up" -> if (y < maxY) y++
                "down" -> if (y > -maxY) y--
                "left" -> if (x > -maxX) x--
                "right" -> if (x < maxX) x++
            }
        }

        return intArrayOf(x, y)
        }
}