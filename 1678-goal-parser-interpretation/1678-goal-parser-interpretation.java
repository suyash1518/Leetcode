class Solution {
    public String interpret(String command) {
        StringBuilder result= new StringBuilder();
        for(int i=0; i< command.length(); i++){
            if(command.charAt(i) == '(' && command.charAt(i+1)== ')'){
                result.append("o");
                i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i +1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')'){
                result.append("al");
                i=i+3;
            }
            else{
                result.append(command.charAt(i));
            }
        }
        return result.toString();
    }
}