class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int arr[]=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                arr[j]=nums[i];
                j++;
                if(j==2)break;
            }
            else hs.add(nums[i]);
        }
        return arr;
    }
}