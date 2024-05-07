class Solution {
    public static int countOneBits(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) count++;
            num /= 2;
        }
        return count;
    }

    public static int solution(int n) {
        int originalOneBits = countOneBits(n);
        int nextNumber = n + 1;

        while (true) {
            if (countOneBits(nextNumber) == originalOneBits) {
                return nextNumber;
            }
            nextNumber++;
        }
    }
}