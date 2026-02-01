class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }
        for (int x : nums2) {
            if (set1.contains(x)) {
                result.add(x);
            }
        }
        int[] res = new int[result.size()];
        int i = 0;
        for (int x : result) {
            res[i++] = x;
        }
        return res;
    }
}
