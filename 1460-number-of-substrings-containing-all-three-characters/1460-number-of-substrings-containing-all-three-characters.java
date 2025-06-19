class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int count= 0;
        HashMap<Character, Integer> freq= new HashMap<>();

        for(int j=0; j<s.length(); j++){
            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j),0)+1);
            while(freq.getOrDefault('a', 0) > 0 &&
                   freq.getOrDefault('b', 0) > 0 &&
                   freq.getOrDefault('c', 0) > 0) {

                    count += s.length() -j;
                    char leftChar = s.charAt(i);
                    freq.put(leftChar, freq.get(leftChar) - 1);
                    i++;
                   }
        }   
        return count; 
    }
}