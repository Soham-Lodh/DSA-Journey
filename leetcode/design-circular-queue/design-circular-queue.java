class MyCircularQueue {
    int arr[];
    int f=-1;
    int r=-1;
    int n;
    public MyCircularQueue(int k) {
        arr=new int[k];
        n=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        else if(isEmpty()){
            f=0;
            r=0;
            arr[r]=value;
            return true;
        }
        else{
            r=(r+1)%n;
            arr[r]=value;
            return true;
        }
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        else if(f==r){
            f=-1;
            r=-1;
            return true;
        }
        else{
            f=(f+1)%n;
            return true;
        }
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return arr[f];
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return arr[r];
    }
    
    public boolean isEmpty() {
        if(f==-1 && r==-1)return true;
        return false;
    }
    
    public boolean isFull() {
        if(((r+1)%n)==f)return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */