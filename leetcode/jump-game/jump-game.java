class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reach) return false;
            int j = i + nums[i];
            reach = Math.max(reach, j);
            if (reach >= nums.length - 1) return true;
        }
        return true;
    }
}
