class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> ana= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            ana.put(ch,ana.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            if(!ana.containsKey(ch) || ana.get(ch) == 0){
                return false;
            }
            ana.put(ch, ana.get(ch) -1);
        }
        return true;
    }
}