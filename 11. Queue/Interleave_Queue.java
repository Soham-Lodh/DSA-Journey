import java.util.*;
public class Interleave_Queue {
    static Queue<Integer> interleave(Queue<Integer> queue){
        Queue<Integer> temp=new ArrayDeque<>();
        int sz=queue.size();
        for(int i=0;i<sz/2;i++){
            temp.offer(queue.poll());
        }
        while(!temp.isEmpty()){
            queue.offer(temp.poll());
            queue.offer(queue.poll());
        }
        return queue;
    }
    public static void main(String args[]){
        Queue<Integer>queue=new ArrayDeque<>();
        for(int i=0;i<=5;i++)queue.offer(i);
        for(int i=0;i<queue.size();i++){
            int ak=queue.poll();
            System.out.print(ak+" ");
            queue.offer(ak);
        }
        queue=interleave(queue);
        System.err.println();
        System.out.println("Interleaved Queue: ");
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }
}
