class Solution {
    fun solution(array: IntArray): Int {
        
        array.sort()
        
        var answerlength =  array.size / 2
        print(answerlength)
        
        
        return array[answerlength]
    }
}