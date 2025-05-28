class Solution {
    public boolean isValid(String s) {
        StringBuilder openBrackets = new StringBuilder();

        for(int i=0; i< s.length();i++){
            char ch= s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                openBrackets.append(ch);
            }
            else{
                if(openBrackets.length() == 0) return false;

                char lastOpen= openBrackets.charAt(openBrackets.length()-1);

                if(ch==')' && lastOpen !='(' || ch=='}' && lastOpen !='{' || ch==']' && lastOpen !='['){
                    return false;
                }
                openBrackets.deleteCharAt(openBrackets.length()-1);
            }
        }
        return openBrackets.length()==0;
    }
}