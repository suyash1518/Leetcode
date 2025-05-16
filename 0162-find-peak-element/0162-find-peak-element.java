class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;

        int start=0;
        int end=n-1;

        while(start<=end){
            int mid= start+(end-start)/2;

            if(mid>0 && mid<n-1){
                if(nums[mid]>nums[mid+1] && nums[mid]> nums[mid-1]) return mid;
            }
            if (mid == 0) { 
                if (nums[mid] > nums[mid + 1]) return mid;
                else return mid + 1;
            }
            if (mid == n - 1) { 
                if (nums[mid] > nums[mid - 1]) return mid;
                else return mid - 1;
            }
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}