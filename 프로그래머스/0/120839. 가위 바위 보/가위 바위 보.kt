class Solution {
    fun solution(rsp: String): String {
    val winMapping = mapOf('2' to '0', '0' to '5', '5' to '2')
    
    val answer = StringBuilder()
    for (char in rsp) {
        answer.append(winMapping[char])
    }
    

    return answer.toString()
    }
}