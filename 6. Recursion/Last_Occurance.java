class Last_Occurance{
    static int search(int arr[],int x,int n){
        if(n==0 && arr[n]!=x)return -1;
        else if(arr[n]==x)return n;
        return search(arr,x,n-1);
    }
    public static void main(String[] args) {
        int arr[]={12,23,12,34,123,41,34};
        int x=12;
        int n=arr.length-1;
        int ans=search(arr,x,n);
        if(ans==-1)System.out.println("Element not found");
        else System.out.println("Last Occurance of "+x+" is at index "+ans);
    }
}