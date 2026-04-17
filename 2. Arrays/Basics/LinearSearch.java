import java.util.*;
public class LinearSearch {
    //O(n)
    public static int linear_search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={12,34,325,12443,21432,645,234435,125,3456,21,443,6233,12432};
        System.out.print("Enter number to search: ");
        int n=sc.nextInt();
        int idx=linear_search(arr,n);
        if(idx<0)System.out.println("Element not found");
        else System.out.println("Element found at index "+idx);
    }
}