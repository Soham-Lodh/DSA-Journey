class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Integer key : freq.keySet()) {
            if(freq.get(key)==1)lst.add(key);
        }
        int[] result = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            result[i] = lst.get(i);
        }
        return result;
    }
}