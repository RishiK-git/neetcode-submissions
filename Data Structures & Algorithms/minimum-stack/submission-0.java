class MinStack {

    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    } 
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int min = stack.peek();
        Stack<Integer> stackTwo = new Stack<>();

        while(!stack.empty()){
            stackTwo.push(stack.pop());
            if(stackTwo.peek() < min){
                min = stackTwo.peek();
            }
        }
        while(!stackTwo.empty()){
            stack.push(stackTwo.pop());
        }

        return min;
    }
}
