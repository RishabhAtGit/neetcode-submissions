class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()) return false;
                Character ch = stack.peek();
                if((s.charAt(i) == ']' && ch != '[') ||
                (s.charAt(i) == '}' && ch != '{') ||
                (s.charAt(i) == ')' && ch != '(')) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
