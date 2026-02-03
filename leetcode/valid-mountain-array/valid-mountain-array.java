class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)return false;
        int p=0,q=0,i=0;
        while(i<arr.length-1 && arr[i]<arr[i+1]){
            p++;
            i++;
        }
        while(i<arr.length-1 && arr[i]>arr[i+1]){
            q++;
            i++;
        }
        if(p>0 && q>0 && p+q==arr.length-1)return true;
        return false;
    }
}