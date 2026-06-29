import java.util.*;
public class ConnectRopes {
    static int cost(int arr[]){
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int cost=0;
        for(int i=0;i<arr.length;i++)queue.offer(arr[i]);
        while(queue.size()>1){
            int a=queue.poll();
            int b=queue.poll();
            cost+=(a+b);
            queue.offer(a+b);
        }
        return cost;
    }
    public static void main(String args[]){
        int arr[]={4,3,2,6};
        System.out.println("Cost: "+cost(arr));
    }
}
