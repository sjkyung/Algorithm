class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        val answer = mutableListOf<IntArray>()
        for(i in num_list.indices step n){
            answer.add(num_list.sliceArray(i until i + n))
        }
        return answer.toTypedArray()
    }
}