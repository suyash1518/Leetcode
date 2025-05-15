class Solution {
    public int findMin(int[] nums) {
        int n= nums.length;
        if(n==0) return 0;

        int start=0;
        int end=n-1;

        while(start<=end){
            int mid= start + (end-start)/2;
            if(nums[start]<=nums[end]) return nums[start];
            int prev= (mid - 1 + n)%n;
            int next= (mid+1) %n;

        if (nums[mid]<=nums[prev] && nums[mid]<=nums[next]){
            return nums[mid];
        }
        else if(nums[mid]>= nums[start]){
            start= mid+1;
        }
        else{
            end= mid;
        }
    }
      return 0;
}
}