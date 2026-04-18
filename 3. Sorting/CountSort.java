import java.util.Arrays;
public class CountSort {
    //O(n+range)
    static void count_sort(int arr[]) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
            max=Math.max(arr[i],max);
        }
        int range=max-min+1;
        int count[]=new int[range];
        for(int i=0;i<arr.length;i++){
            count[arr[i]-min]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[k]=i+min;
                k++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, -2, 5, -2, 0, 3, -1};
        count_sort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}