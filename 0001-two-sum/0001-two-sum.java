
public class Solution {
     public int[] twoSum(int[] nums, int target) {
int n=nums.length;

  for(int i=0; i<n; i++){
  for(int j=n-1; j>i; j--){
    if(nums[i]+nums[j]==target){
        return new int[]{i, j};
    }
  }
 }
 return new int[]{-1, -1};
}
}
