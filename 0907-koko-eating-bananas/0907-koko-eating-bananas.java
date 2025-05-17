class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        if (n == 0) return 0;

        int max=0;
        for(int i=0; i<n;i++){
            if(piles[i]>max){
            max= piles[i];
            }
        }

        int start=1;
        int end=max;
        int result=max;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(canFinish(piles,h,mid)){
                result=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    private boolean canFinish(int[] piles, int h, int speed){
        int hoursNeeded=0;
        for(int i=0;i<piles.length;i++){
            hoursNeeded += (piles[i]+speed-1L)/speed;
            if (hoursNeeded > h) return false;
        }
        return hoursNeeded<=h;
    }
}