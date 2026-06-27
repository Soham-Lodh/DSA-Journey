public class circular_queue {
    static class CricularQueue{
        int rear,front;
        int queue[];
        int size;
        CricularQueue(int n){
            queue=new int[n];
            rear=front=-1;
            size=n;
        }
        boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        boolean isFull(){
            return front==(rear+1)%size;
        }
        void enqueue(int n){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            else if(isEmpty()){
                rear=front=0;
                queue[front]=n;
                return;
            }
            else{
                rear=(rear+1)%size;
                queue[rear]=n;
                return;
            }
        }
        int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else if(rear==front){
                int n=queue[front];
                rear=front=-1;
                return n;
            }
            else{
                int n=queue[front];
                front=(front+1)%size;
                return n;
            }
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return queue[front];
        }
    }
    public static void main(String[] args) {
        CricularQueue q=new CricularQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
