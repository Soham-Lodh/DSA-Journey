import java.util.*;

public class reverse_queue {
    static void reverse_optimized(Queue<Integer> queue){
        if(queue.isEmpty())return;
        else{
            int ak=queue.poll();
            reverse_optimized(queue);
            queue.offer(ak);
        }
    }
    static void reverse(Queue<Integer> queue){
        Stack<Integer> stack=new Stack<>();
        while(!queue.isEmpty())stack.push(queue.poll());
        while(!stack.isEmpty())queue.offer(stack.pop());
    }
    public static void main(String[] args) {
        Queue<Integer>queue=new ArrayDeque<>();
        for(int i=0;i<=5;i++)queue.offer(i);
        for(int i=0;i<queue.size();i++){
            int ak=queue.poll();
            System.out.print(ak+" ");
            queue.offer(ak);
        }
        System.out.println();
        System.out.println("Reverse: ");
        reverse(queue);
        for(int i=0;i<queue.size();i++){
            int ak=queue.poll();
            System.out.print(ak+" ");
            queue.offer(ak);
        }
        System.out.println();
        System.out.println("Optimized Reverse: ");
        reverse_optimized(queue);
        for(int i=0;i<queue.size();i++){
            int ak=queue.poll();
            System.out.print(ak+" ");
            queue.offer(ak);
        }
    }
}