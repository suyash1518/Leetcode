class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int start=0;
        double avg=0.0;
        int maxSum=Integer.MIN_VALUE;

        for(int end=0; end<n; end++){
            sum += nums[end];
            if(end >= k-1){
            maxSum =Math.max(maxSum,sum);
            sum -= nums[start];
            start++;
        }
        }
        avg= (double) maxSum/k;
        return avg;
    }
}