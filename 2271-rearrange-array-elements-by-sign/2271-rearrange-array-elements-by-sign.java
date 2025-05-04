class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) pos.add(num);
            else neg.add(num);
        }

        int[] result = new int[n];
        for (int i = 0; i < n / 2; i++) {
            result[2 * i] = pos.get(i);
            result[2 * i + 1] = neg.get(i);   
        }

        return result;
    }
}
