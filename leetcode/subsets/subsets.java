class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = lst.size();
            for (int j = 0; j < size; j++) {
                List<Integer> ak = new ArrayList<>(lst.get(j));
                ak.add(nums[i]);
                lst.add(ak);
            }
        }
        return lst;
    }
}
