class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n=heights.length;
        Stack<Integer> s= new Stack<>();
        int[] right= new int[n];
        int[] left= new int[n];
        int maxArea= 0;

        for(int i=0; i<n; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                left[i]= -1;
            }
            else{
                left[i]= s.peek();
            }
            s.push(i);
        }
        
            s.clear();
            for (int i = n - 1; i >= 0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                right[i]= n;
            }
            else{
                right[i]= s.peek();
            }
            s.push(i);
        }
        for(int i=0; i<n; i++){
            int width= right[i] - left[i] -1;
            int area= heights[i] * width;
            maxArea= Math.max(maxArea,area);
        }
        return maxArea;
    }
}