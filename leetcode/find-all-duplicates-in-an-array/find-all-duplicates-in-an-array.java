class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int k=Math.abs(nums[i]);
            if(nums[k-1]>0)nums[k-1]*=-1;
            else list.add(Math.abs(nums[i]));
        }
        return list;
    }
}