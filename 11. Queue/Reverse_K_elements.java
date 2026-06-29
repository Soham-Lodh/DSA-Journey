import java.util.*;
public class Reverse_K_elements {
    static void reverseK(Queue<Integer> queue,int k){
        int sz=queue.size();
        k=k%sz;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++)stack.push(queue.poll());
        while(!stack.isEmpty())queue.offer(stack.pop());
        for(int i=0;i<sz-k;i++){
            queue.offer(queue.poll());
        }
    }
    public static void main(String[] args){
        Queue<Integer> queue=new ArrayDeque<>();
        for(int i=10;i<=100;i+=10)queue.offer(i);
        System.out.println("Queue before reversing: "+queue);
        reverseK(queue,5);
        System.out.println("Queue after reversing: "+queue);
    }
}
