public class SubArraySum_Kadane_Algorithm {
    public static void main(String[] args) {
        int arr[]={12,-24,1,12,-12,3,-23,1};
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0)cs=0;
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum sum: "+ms);
    }
}
