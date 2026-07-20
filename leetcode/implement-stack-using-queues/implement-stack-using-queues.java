class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue=new ArrayDeque<>();
    }
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
        Queue<Integer> q=new ArrayDeque<>();
        while(queue.size()>1)q.offer(queue.poll());
        int n=queue.poll();
        queue=q;
        return n;
    }
    
    public int top() {
        Queue<Integer> q=new ArrayDeque<>();
        while(queue.size()>1)q.offer(queue.poll());
        int n=queue.poll();
        q.offer(n);
        queue=q;
        return n;
    }
    
    public boolean empty() {
        return queue.isEmpty();
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