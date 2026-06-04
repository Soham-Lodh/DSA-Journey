class MergeSort {
    static void mergeSort(int arr[],int left,int right){
        if(left>=right)return;
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,right,mid);
    }
    static void merge(int arr[],int left,int right,int mid){
        int temp[]=new int[right-left+1];
        int k=0;
        int i=left,j=mid+1;
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)temp[k++]=arr[i++];
        while(j<=right)temp[k++]=arr[j++];
        for(k=0,i=left;i<=right;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }    
}
