class MyStack {
    Deque<Integer> d;
    public MyStack() {
        d = new ArrayDeque<>();
    }
    
    public void push(int x) {
        d.addLast(x);
    }
    
    public int pop() {
        return d.removeLast();
    }
    
    public int top() {
        return d.peekLast();
    }
    
    public boolean empty() {
        return d.isEmpty();
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