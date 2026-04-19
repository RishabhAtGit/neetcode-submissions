class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            minStack.push(val);
        }else{
            if(val < minStack.peek()){
                minStack.push(val);
            }else{
                minStack.push(minStack.peek());
            }
            stack.push(val);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return !stack.isEmpty() ? minStack.peek() : Integer.MIN_VALUE;
    }
}
