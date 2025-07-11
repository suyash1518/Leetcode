class Solution {
    public int maximalRectangle(char[][] matrix) {

        if(matrix==null || matrix.length==0 || matrix[0].length==0) return 0;
        
        int n= matrix.length;
        int m= matrix[0].length;
        int[] heights= new int[m];
        int maxArea= 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == '1'){
                    heights[j] += 1;
                }
                else{
                    heights[j] = 0;
                }
            }
            maxArea =Math.max(maxArea, largestRectangleArea(heights)); 
        }
        return maxArea;
    }

        private int largestRectangleArea(int[] heights){
            int n= heights.length;
            Stack<Integer> s= new Stack<>();
            int[] right= new int[n];
            int[] left= new int[n];
            int maxArea=0;

            for(int i=0; i<n; i++){
                while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    left[i] =-1;
                }
                else{
                    left[i] =s.peek();
                }
                s.push(i);
            }
            s.clear();
            for(int i=n-1; i>=0; i--){
                while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    right[i] =n;
                }
                else{
                    right[i] =s.peek();
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