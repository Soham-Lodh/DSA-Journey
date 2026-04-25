public class Check_sorted {
    static boolean is_sorted(int arr[],int n){
        if(n==0)return true;
        else if(arr[n]<arr[n-1])return false;
        return is_sorted(arr,n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,4,5};
        int n=arr.length;
        if(is_sorted(arr,n-1))System.out.println("Sorted");
        else System.out.println("Not Sorted");
    }
}
