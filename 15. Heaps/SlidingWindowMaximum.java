import java.util.*;
public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int val,idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p){
            return p.val-this.val;
        }
    }
    static int[] maxSlidingWindow(int arr[],int k){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int res[]=new int[arr.length-k+1];
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i));
        }
        res[0]=pq.peek().val;
        int ak=1;
        for(int i=k;i<arr.length;i++){
            while(!pq.isEmpty() && pq.peek().idx<=(i-k))pq.remove();
            pq.add(new Pair(arr[i],i));
            res[ak++]=pq.peek().val;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(arr, k);
        System.out.println("Sliding Window Maximum: " + Arrays.toString(result));
    }
}
