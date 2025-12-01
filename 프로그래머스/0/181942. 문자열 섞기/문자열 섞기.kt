class Solution {
    fun solution(str1: String, str2: String): String {
        var answer = StringBuilder()
        
        for(i in str1.indices){
            answer.append(str1[i])
            answer.append(str2[i])
        }
        
        
        return answer.toString()
    }
}