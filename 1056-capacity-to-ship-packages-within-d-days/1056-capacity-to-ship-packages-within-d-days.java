class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n= weights.length;
        int maxWeight=0;
        int totalWeight=0;
        if(n==0) return 0;

        for(int i=0;i<n;i++){
            maxWeight = Math.max(maxWeight, weights[i]);
            totalWeight += weights[i];
        }

        int start=maxWeight;
        int end= totalWeight;
        int result= totalWeight;

        while(start<=end){
            int mid= start+(end-start)/2;

            if(haveCapacity(weights, days, mid)){
                result=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    private boolean haveCapacity(int[] weights, int days, int c){
        int daysRequired = 1, currentLoad = 0;

        for (int i = 0; i < weights.length; i++) {
            if (currentLoad + weights[i] > c) {
                daysRequired++;
                currentLoad = 0;
            }
            currentLoad += weights[i]; 
            if (daysRequired > days) return false; 
        }
        return true;
    }
}