class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n= candies.length;
        int current=0;
        int max=0;
        for(int j=0; j<n; j++){
            max= Math.max(candies[j], max);
        }
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            current= candies[i] + extraCandies;
            if(current >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}