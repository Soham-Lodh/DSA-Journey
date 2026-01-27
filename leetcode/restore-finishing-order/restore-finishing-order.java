class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int arr[]=new int[friends.length];
        int i=0;
        for(int j=0;j<order.length;j++){
            int k=0;
            while(k<friends.length){
                if(friends[k]==order[j]){
                    arr[i]=friends[k];
                    i++;
                }
                k++;
            }
            if(k==arr.length-1)break;
        }
        return arr;
    }
}