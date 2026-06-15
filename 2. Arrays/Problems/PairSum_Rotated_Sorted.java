public class PairSum_Rotated_Sorted{
    static int pivot(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if (mid < right && arr[mid] > arr[mid + 1])return mid;
            if (mid > left && arr[mid] < arr[mid - 1])return mid - 1;
            else if(arr[mid]>=arr[left])left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
    static void search(int arr[],int target){
        int pivot=pivot(arr);
        if(pivot==-1){
            System.out.println("Array is not rotated");
            return;
        }
        int left=pivot+1;
        int right=pivot;
        while(left!=right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Indexes: "+left+" "+right);
                return;
            }
            else if(sum<target)left=(left+1)%arr.length;
            else right=(arr.length+right-1)%arr.length;
        }
        System.out.println("Pair Sum not found");
        return;
    }
    public static void main(String[] args) {
        int arr[]={11,15,6,8,9,10};
        int target=16;
        search(arr, target);
    }
}