class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n= nums.length;
        long count =0;
        long consecutive= 0;
        for(int num: nums){
            if(num == 0){
                consecutive++;
                count += consecutive;
            }
            else{
                consecutive=0;
            }
        }
        return count;
    }
}