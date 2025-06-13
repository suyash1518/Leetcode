class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        //if(n == 0) return 0;
        //int[] result= new int[2];

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(numbers[i] + numbers[j] == target){
                   return new int[] {i+1,j+1};
                }
            }
        }
        return new int[0];
    }
}