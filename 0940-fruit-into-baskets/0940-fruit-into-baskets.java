class Solution {
    public int totalFruit(int[] fruits) {
        int n= fruits.length;

        int left =0;
        //int right= 0;
        int maxlen= 0;
        //int ans =0;
        HashMap<Integer,Integer> map= new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            int f=fruits[right];
            map.put(f, map.getOrDefault(f,0)+1);
            
            while(map.size() >2){
                map.put(fruits[left], map.get(fruits[left])-1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxlen= Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}