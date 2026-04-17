public class SubArraySum_BruteForce {
    public static void main(String args[]){
        int arr[]={12,243,-523,32,-1243,543512,32};
        int max_sum=Integer.MIN_VALUE;
        //O(n^3)
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max_sum=Math.max(sum,max_sum);
            }
        }
        System.out.println("Maximum sum: "+max_sum);
    }
}
