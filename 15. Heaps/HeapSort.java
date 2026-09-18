import java.util.*;
public class HeapSort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void heapify(int arr[],int i,int n){
        if(i>n)return;
        int l=2*i+1;
        int r=2*i+2;
        int max=i;
        if(l<n && arr[max]<arr[l])max=l;
        if(r<n && arr[max]<arr[r])max=r;
        if(max!=i){
            swap(arr,max,i);
            heapify(arr,max,n);
        }
    }
    static void heapsort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>=0;i--)heapify(arr,i,n);
        for(int i=n-1;i>=1;i--){
            swap(arr,0,i);
            heapify(arr,0,i);
        }
    }
    public static void main(String[] args){
        int arr[]={12,54,23,45,23,46,5,6,2,4,6,7,32,3};
        heapsort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
