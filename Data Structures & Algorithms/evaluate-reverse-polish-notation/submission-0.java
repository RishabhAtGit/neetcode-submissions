class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ch : tokens){
            if(isNumber(ch)){
                stack.push(Integer.valueOf(ch));
            }else{
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(evaluate(operand1,operand2,ch));
            }
        }
        return stack.pop();
    }

    private boolean isNumber(String ch){
        if(ch == null) return false;

        try{
            Integer.parseInt(ch);
            return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }

    private int evaluate(int op1, int op2, String ch){
        int result = 0;
        switch(ch){
            case "+":
                result = op1 + op2;
                break;
            case "*":
                result = op1 * op2;
                break;
            case "/":
                result = op1 / op2;
                break;
            case "-":
                result = op1 - op2; 
                break;   
        }
        return result;
    }
}
