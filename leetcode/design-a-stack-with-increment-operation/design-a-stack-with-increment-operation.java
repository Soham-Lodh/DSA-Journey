class CustomStack {
    int top = -1;
    int arr[];
    int n;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        n = maxSize;
    }

    public void push(int x) {
        if (top < n - 1)
            arr[++top] = x;
    }

    public int pop() {
        if (top != -1)
            return arr[top--];
        return -1;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min((top+1), k); i++) {
            arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */