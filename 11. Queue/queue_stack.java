import java.util.*;
public class queue_stack {
    static class queue1{
        Stack<Integer> stack=new Stack<>();
        boolean isEmpty(){
            return stack.isEmpty();
        }
        void enqueue(int n){
            stack.push(n);
        }
        int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                Stack<Integer> s=new Stack<>();
                while(!stack.isEmpty())s.push(stack.pop());
                int n=s.pop();
                while(!s.isEmpty())stack.push(s.pop());
                return n;
            }
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                Stack<Integer> s=new Stack<>();
                while(!stack.isEmpty())s.push(stack.pop());
                int n=s.peek();
                while(!s.isEmpty())stack.push(s.pop());
                return n;
            }
        }
    }
    static class queue2{
        Stack<Integer> stack=new Stack<>();
        boolean isEmpty(){
            return stack.isEmpty();
        }
        void enqueue(int n){
            Stack<Integer> s=new Stack<>();
            while(!stack.isEmpty())s.push(stack.pop());
            s.push(n);
            while(!s.isEmpty())stack.push(s.pop());
        }
        int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                return stack.pop();
            }
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                return stack.peek();
            }
        }
    }
    public static void main(String[] args) {
        queue1 q=new queue1();
        System.out.println("Queue 1");
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println("Queue 2");
        queue2 q2=new queue2();
        q2.enqueue(1);
        q2.enqueue(2);
        q2.enqueue(3);
        System.out.println(q2.dequeue());
        System.out.println(q2.peek());
    }
}
