class Solution {
    public int splitArray(int[] nums, int k) {
        int n= nums.length;
        if(n==0) return 0;
        int maxEle=0;
        int totalSum=0;

        for(int i=0;i<n;i++){
            maxEle = Math.max(maxEle,nums[i]);
            totalSum += nums[i];
        }

        int start=maxEle;
        int end= totalSum;
        int result= -1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(wapisMax(nums,k,mid,n)==true){
                result=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    private static boolean wapisMax(int[] nums,int k,int max,int n){
        int sum=0;
        int st=1;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        
        if(sum>max){
         st++;
         sum=nums[i];
        }
        if(st>k) return false;
    }
    return true;
    }
}