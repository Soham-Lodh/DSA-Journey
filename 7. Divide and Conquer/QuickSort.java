class QuickSort {
    static void quickSort(int arr[], int low, int high) {
        if(low>=high)return;
        int pivot=partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }
    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        int idx=low;
        while(idx<high){
            if(arr[idx]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
            idx++;
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
