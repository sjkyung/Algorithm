class Solution {
    fun solution(babbling: Array<String>): Int {
    val words = listOf("aya", "ye", "woo", "ma")
    var count = 0

    for (word in babbling) {
        var temp = word

        for (w in words) {
            temp = temp.replace(w, " ")
        }

        
        if (temp.trim().isEmpty()) {
            count++
        }
    }

    return count
    }
}