class MyQueue {
    Deque<Integer> q;
    public MyQueue() {
        q = new ArrayDeque();
    }
    
    public void push(int x) {
        q.addLast(x);
    }
    
    public int pop() {
        return q.removeFirst();
    }
    
    public int peek() {
        return q.peekFirst();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */