class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        Stack<Integer> s= new Stack<>();
        int[] res= new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }

        for(int i= 2*n -1 ; i>=0; i--){
            int curr = nums[i % n];
            while(!s.isEmpty() && s.peek() <= curr){
                s.pop(); 
            }
            if(i <n){
                res[i] = s.empty()?-1:s.peek();
            }
            s.push(curr);
        }
        return res;
    }
}