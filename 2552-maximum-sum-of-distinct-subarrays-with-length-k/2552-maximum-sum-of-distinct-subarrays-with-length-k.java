class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n= nums.length;
        if(k>n) return 0;

        long windowSum=0;
        long maxSum=0;
        int start=0;
        Set<Integer> windowSet= new HashSet<>();

        for(int end=0; end<n; end++){
            while(windowSet.contains(nums[end])){
                windowSet.remove(nums[start]);
                 windowSum -= nums[start];
                 start++;
            }

            windowSet.add(nums[end]);
            windowSum += nums[end];

            if(end >= k-1 && windowSet.size() == k){
                maxSum = Math.max(maxSum, windowSum);
                windowSet.remove(nums[start]);
                windowSum -= nums[start];
                start++;
            }
        }
        return maxSum;
    }
}