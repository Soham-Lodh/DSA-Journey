import java.util.*;
class Function{
    
    public int linear_search(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n)return i;
        }
        return -1;
    }
    
    public int binary_search(int arr[],int n){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==n)return mid;
            else if(arr[mid]<n)left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
    
    public int largest(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            large=Math.max(arr[i],large);
        }
        return large;
    }
    
    public int smallest(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            small=Math.min(arr[i],small);
        }
        return small;
    }
    
    public void reverse(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }

    public void print_pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+i+","+j+") ");

            }
            System.err.println();
        }
    }
}
public class Basics{
    public static void main(String[] args) {
        Function fn=new Function();
        Scanner sc = new Scanner(System.in);
        int arr[]={12,34,325,12443,21432,645,234435,125,3456,21,443,6233,12432};
        
        //Linear Search O(n)
        // System.out.print("Enter number to search: ");
        // int n=sc.nextInt();
        // int idx=fn.linear_search(arr,n);
        // if(idx<0)System.out.println("Element not found");
        // else System.out.println("Element found at index "+idx);
        
        //Binary Search O(log n) - only for sorted arrays
        // int sort_arr[]=new int[12,23,34,45,56,67,78,89,90];
        // int n=sc.nextInt();
        // int idx=fn.binary_search(arr,n);
        // if(idx<0)System.out.println("Element not found");
        // else System.out.println("Element found at index "+idx);
        
        //Largest Element O(n)
        // System.out.println("Largest element: "+fn.largest(arr));
        
        //Smallest element O(n)
        // System.out.println("Smallest element: "+fn.smallest(arr));

        //Reverse an array O(n)
        // System.out.println("Original array: "+Arrays.toString(arr));
        // fn.reverse(arr);
        // System.out.println("Reversed array: "+Arrays.toString(arr));
        
        //Print Pairs O(n^2)
        //Total number of pairs = n*(n-1)/2
        fn.print_pairs(arr);
    }
}