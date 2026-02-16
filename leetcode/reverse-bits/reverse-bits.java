class Solution {
    public int reverseBits(int n) {
        int arr[]=new int[32];
        Arrays.fill(arr,0);
        for(int i=0;i<32;i++){
            if(n<=0)break;
            else{
                arr[i]=n%2;
                n/=2;
            }
        }
        n=0;
        for(int i=0;i<=31;i++){
            if(arr[i]!=0)n+=Math.pow(2,32-i-1);
        }
        return n;
    }
    
}