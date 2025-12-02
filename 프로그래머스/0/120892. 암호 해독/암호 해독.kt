class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        
        val char = cipher.toCharArray() 
        
        for(i in code..cipher.length step code){
            answer += char[i - 1] 
        }
        
        return answer
    }
}