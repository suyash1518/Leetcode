class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(int i= 0; i<tokens.length; i++){
            String token= tokens[i];
            if("+-*/".contains(token)){
                int b= stack.pop();
                int a= stack.pop();
                int res= 0;

                switch(token){
                    case "+": res= a+b; break;
                    case "-": res= a-b; break;
                    case "*": res= a*b; break;
                    case "/": res= a/b; break;
                }
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}