class MyStack {
    Queue<Integer> stack1;
    Queue<Integer> stack2; 
    public MyStack() {
        stack1 = new LinkedList<>(); 
        stack2 = new LinkedList<>();
    }
    public void push(int x) {
        stack2.add(x);
        while(!stack1.isEmpty()){
            stack2.add(stack1.remove());
        }
        Queue<Integer> temp = stack1;
        stack1 = stack2; 
        stack2 = temp;
    }
    
    public int pop() {
        return stack1.remove();
        
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public boolean empty(){
        return stack1.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */