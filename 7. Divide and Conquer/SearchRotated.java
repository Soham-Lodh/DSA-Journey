class SearchRotated {
    static int search(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]>=arr[start]){
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }
                else start=mid+1;
            }
            else{
                if(target<=arr[end] && target>arr[mid]){
                    start=mid+1;
                }
                else end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans = search(arr, target,0,arr.length-1);
        System.out.println(ans);
    }
}
