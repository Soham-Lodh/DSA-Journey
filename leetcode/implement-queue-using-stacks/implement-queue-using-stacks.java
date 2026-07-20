class MyQueue {
    Stack<Integer> s;
    public MyQueue() {
        s=new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        Stack<Integer> q=new Stack<>();
        while(s.size()>1)q.push(s.pop());
        int n=s.pop();
        while(!q.isEmpty())s.push(q.pop());
        return n;
    }
    
    public int peek() {
        Stack<Integer> q=new Stack<>();
        while(s.size()>1)q.push(s.pop());
        int n=s.pop();
        s.push(n);
        while(!q.isEmpty())s.push(q.pop());
        return n;
    }
    
    public boolean empty() {
        return s.isEmpty();
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