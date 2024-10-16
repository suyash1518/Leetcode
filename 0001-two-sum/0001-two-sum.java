import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
