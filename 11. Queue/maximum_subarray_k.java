import java.util.*;
public class maximum_subarray_k {
    static Queue<Integer> MaxSubarray(int arr[],int k){
        Queue<Integer>queue=new ArrayDeque<>();
        for(int i=0;i<=arr.length-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            queue.offer(max);
        }
        return queue;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        Queue<Integer> queue = MaxSubarray(arr, k);
        System.out.println(queue);
    }
}
