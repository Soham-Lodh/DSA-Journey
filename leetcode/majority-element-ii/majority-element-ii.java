class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> lst=new ArrayList<>();
        for(int x:nums){
            int count = freq.getOrDefault(x, 0) + 1;
            if(count==((nums.length/3)+1))lst.add(x);
            freq.put(x, count);
        }
        return lst;
    }
}