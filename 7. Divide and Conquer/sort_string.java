class sort_string {
    static void mergeSort(String arr[],int low,int high){
        if(low>=high)return;
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(String arr[],int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int n=high-low+1;
        int k=0;
        String temp[]=new String[n];
        while(i<=mid && j<=high){
            if(arr[i].compareTo(arr[j])<=0){
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
        while(j<=high)temp[k++]=arr[j++];
        for(i=low,k=0;i<=high;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        String arr[]={"banana","apple","grape","orange"};
        mergeSort(arr,0,arr.length-1);
        for(String s:arr)System.out.print(s+" ");
    }
}
