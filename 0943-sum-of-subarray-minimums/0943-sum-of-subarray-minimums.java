class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        
        int[] prev = new int[n];
        int[] next = new int[n];

        // Stack to find Previous Less Element (PLE)
        Stack<int[]> stack1 = new Stack<>();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (!stack1.isEmpty() && stack1.peek()[0] > arr[i]) {
                count += stack1.pop()[1];
            }
            prev[i] = count;
            stack1.push(new int[]{arr[i], count});
        }

        // Stack to find Next Less Element (NLE)
        Stack<int[]> stack2 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int count = 1;
            while (!stack2.isEmpty() && stack2.peek()[0] >= arr[i]) {
                count += stack2.pop()[1];
            }
            next[i] = count;
            stack2.push(new int[]{arr[i], count});
        }

        // Calculate result using contribution of each element
        long result = 0;
        for (int i = 0; i < n; i++) {
            long contribution = (long) arr[i] * prev[i] * next[i];
            result = (result + contribution) % MOD;
        }

        return (int) result;
    }
}
