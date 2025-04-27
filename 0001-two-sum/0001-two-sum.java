import java.util.HashMap;
public class Solution {
     public int[] twoSum(int[] nums, int target) {
int n=nums.length;
HashMap<Integer,Integer> maps=new HashMap<>();

  for(int i=0; i<n; i++){
    int complement= target - nums[i];
    if(maps.containsKey(complement)){
        return new int[]{maps.get(complement),i};
    }
    maps.put(nums[i],i);
  }
  return new int[]{};
}
}
