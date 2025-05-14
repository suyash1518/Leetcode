class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;

        if(n==0) return -1;
        int mid= n/2;
        
        if(target <= nums[mid]){
            for(int i= mid; i>=0; i--){
                if(nums[i]==target) return i;
            }
        }
        else if(target >= nums[mid]){
            for(int j= mid+1; j<n; j++){
                if(nums[j]==target) return j;
            }
        }
        return -1;
    }
}