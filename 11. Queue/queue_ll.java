import java.util.*;
public class queue_ll {
    static class queue{
        LinkedList<Integer> ll;
        queue(){
            ll=new LinkedList<>();
        }
        boolean isEmpty(){
            return ll.isEmpty();
        }
        void enqueue(int n){
            ll.addLast(n);
        }
        int dequeue(){
            if(ll.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return ll.removeFirst();
        }
        int peek(){
            if(ll.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return ll.getFirst();
        }
    }
    public static void main(String args[]){
        queue q=new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
