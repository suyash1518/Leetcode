class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false; // Power of 3 cannot be 0 or negative numbers
        }
        
        while (n % 3 == 0) { // Check if divisible by 3
            n /= 3; // Divide n by 3
        }
        
        return n == 1; // If n becomes 1, it is a power of 3
    }
}
