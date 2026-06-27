
public class queue_array {

    static class queue {

        int rear;
        int queue[];

        queue(int n) {
            queue = new int[n];
            rear = -1;
        }

        boolean isEmpty() {
            return rear == -1;
        }

        boolean isFull() {
            return rear >= queue.length - 1;
        }

        void enqueue(int n) {
            if (isFull()) {
                System.out.println("Queue is full");
            } else {
                queue[++rear] = n;
            }
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int n = queue[0];
                for (int i = 0; i < rear; i++) {
                    queue[i] = queue[i + 1];
                }
                rear--;
                return n;
            }

        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return queue[0];
        }
    }

    public static void main(String args[]) {
        queue q = new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
