class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            hs.add(nums[i]);
        }
        for(int i=min+1;i<max;i++){
            if(!hs.contains(i))list.add(i);
        }
        return list;
    }
}