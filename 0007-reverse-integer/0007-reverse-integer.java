class Solution {
    public int reverse(int x) {
        int ans=0;
        if(x>0){
            while(x>0){
                int d=x%10;
                x=x/10;
                if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10){
                    ans = 0;
                    break;
                }
                else{
                    ans=(ans*10)+d;
                }
            }
        }
        else{
            x=(x*(-1));
            while(x>0){
                int d=x%10;
                x=x/10;
                if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10){
                    ans = 0;
                    break;
                }
                else{
                    ans=(ans*10)+d;
                }
            }
            ans=ans*(-1);
        }
        return ans;
    }
}