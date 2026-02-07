class Solution {
    fun solution(board: Array<IntArray>): Int {
            val n = board.size
            val directions = arrayOf(
                intArrayOf(-1, -1), intArrayOf(-1, 0), intArrayOf(-1, 1),
                intArrayOf(0, -1), intArrayOf(0, 1),
                intArrayOf(1, -1), intArrayOf(1, 0), intArrayOf(1, 1)
            )

            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (board[i][j] == 1) {
                        for (dir in directions) {
                            val ni = i + dir[0]
                            val nj = j + dir[1]
                            if (ni in 0 until n && nj in 0 until n && board[ni][nj] == 0) {
                                board[ni][nj] = 2 
                            }
                        }
                    }
                }
            }

            var safeCount = 0
            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (board[i][j] == 0) safeCount++
                }
            }

            return safeCount
    }
}