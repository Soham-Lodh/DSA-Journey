class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                long targ=(long)target-nums[i]-nums[j];
                int low=j+1;
                int high=nums.length-1;
                while(low<high){
                    long sum=nums[low]+nums[high];
                    if(sum==targ){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        while(low<high &&nums[low]==nums[low+1]){
                            low++;
                        }
                        while(low<high && nums[high]==nums[high+-1]){
                            high--;
                        }
                        high--;
                        hs.add(list);
                    }
                    else if(sum>targ)high--;
                    else low++;
                }
            }
        }
        return new ArrayList<>(hs);
    }

}