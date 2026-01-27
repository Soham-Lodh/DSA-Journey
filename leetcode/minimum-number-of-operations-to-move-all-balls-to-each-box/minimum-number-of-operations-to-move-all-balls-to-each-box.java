class Solution {
    public int[] minOperations(String boxes) {
        int arr[]=new int[boxes.length()];
        for(int i=0;i<arr.length;i++){
            int j=0;
            while(j<arr.length){
                if(j!=i){
                    if(boxes.charAt(j)=='1')arr[i]+=Math.abs(j-i);
                }
                j++;
            }
        }
        return arr;
    }
}