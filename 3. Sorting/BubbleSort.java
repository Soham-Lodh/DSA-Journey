import java.util.*;
public class BubbleSort {
    //O(n^2)
    static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)break;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,456,234,652,356423,45567,1,3,672,52};
        bubble_sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}
