class Solution {
    public int solution(int[] numbers, int target) {
         return dfs(numbers, target, 0, 0);
    }
    
    public int dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        
        int result = 0;
        result += dfs(numbers, target, index + 1, sum + numbers[index]);
        result += dfs(numbers, target, index + 1, sum - numbers[index]);
        return result;
    }
}