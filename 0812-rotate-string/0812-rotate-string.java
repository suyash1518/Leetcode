class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        for(int i =0; i<s.length(); i++){
            String string1= s.substring(0,i);
            String string2= s.substring(i);

            if(goal.equals(string1+string2 ) || goal.equals(string2+string1)){
                return true;
            }
        }
        return false;
    }
}