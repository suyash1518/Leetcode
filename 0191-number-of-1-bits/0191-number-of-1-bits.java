class Solution {
    public int hammingWeight(int n) {
        int rem= 0;
        StringBuilder binary= new StringBuilder();
        while(n > 0){
            binary.append(n %2);
            n= n/2;
        }
        int count=0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i) == '1') count++;
        }
        return count;
    }
}