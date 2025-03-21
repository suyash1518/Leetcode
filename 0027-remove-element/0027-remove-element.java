class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to store the next valid element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Overwrite elements
                k++; // Move to the next position
            }
        }
        return k; // k is the count of elements not equal to val
    }
}
