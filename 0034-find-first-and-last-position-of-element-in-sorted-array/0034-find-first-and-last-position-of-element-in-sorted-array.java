class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;
        int start=0;
        int end= n-1;
        int[] result= {-1,-1};
        

        while(start<=end){
            int mid= start + (end - start)/2;

            if(target == nums[mid]){
                result[0] = mid;
                end= mid-1;
            }
            else if(nums[mid] < target){
                start= mid +1;
            }
            else{
                end= mid -1;
            }
        }
        start=0;
        end= n-1;
        while(start<=end){
            int mid= start + (end - start)/2;

            if(target == nums[mid]){
                result[1] = mid;
                start= mid+1;
            }
            else if(nums[mid] < target){
                start= mid +1;
            }
            else{
                end= mid -1;
            }
        }

        return result;
    }
}