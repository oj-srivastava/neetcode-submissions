class MinStack {
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> minstack = new ArrayDeque<>();

    public MinStack() {

    }
    
    public void push(int val) {
        this.stack.push(val);
        int min = val;
        if(!this.minstack.isEmpty()){
            min = Math.min(this.minstack.peek(), val);
        }
        this.minstack.push(min);
    }
    
    public void pop() {
        this.minstack.pop();
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minstack.peek();
    }
}
