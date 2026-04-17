public class SubArraySum_PrefixSum {
    public static void main(String[] args) {
        int arr[]={12,324,-2,345,-2343,4,-123};
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        int max_sum=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)prefix[i]=arr[i]+prefix[i-1];
        //O(n^2)
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                max_sum=Math.max(sum,max_sum);
            }
        }
        System.out.println("Maximum Sum: "+max_sum);
    }
}
