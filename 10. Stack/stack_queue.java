
import java.util.*;
public class stack_queue {
    static class stack1{
        Queue<Integer> queue=new ArrayDeque<>();
        boolean isEmpty(){
            return queue.isEmpty();
        }
        void push(int n){
            queue.offer(n);
        }
        int dequeue(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            else{
                Queue<Integer> q=new ArrayDeque<>();
                while(!queue.isEmpty())q.offer(queue.poll());
                int n=q.poll();
                while(!q.isEmpty())queue.offer(q.poll());
                return n;
            }
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            else{
                Queue<Integer> q=new ArrayDeque<>();
                while(!queue.isEmpty())q.offer(queue.poll());
                int n=q.peek();
                while(!q.isEmpty())queue.offer(q.poll());
                return n;
            }
        }
    }
    static class stack2{
        Queue<Integer> queue=new ArrayDeque<>();
        boolean isEmpty(){
            return queue.isEmpty();
        }
        void push(int n){
            Queue<Integer> q=new ArrayDeque<>();
            while(!queue.isEmpty())q.offer(queue.poll());
            q.offer(n);
            while(!q.isEmpty())queue.offer(q.poll());
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return queue.poll();
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return queue.peek();
        }
    }
    public static void main(String[] args) {
        stack1 s1=new stack1();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1.peek());
        System.out.println(s1.dequeue());
        System.out.println(s1.peek());
        System.out.println(s1.dequeue());
        System.out.println(s1.peek());
        System.out.println(s1.dequeue());
        System.out.println(s1.peek());
        stack2 s2=new stack2();
        s2.push(1);
        System.out.println(s2.peek());
        System.out.println(s2.pop());
        System.out.println(s2.peek());
    }
}
