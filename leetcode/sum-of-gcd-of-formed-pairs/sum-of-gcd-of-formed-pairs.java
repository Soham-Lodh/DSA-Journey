class Solution {
    public long gcdSum(int[] nums) {
        int max[] = new int[nums.length];
        int gcd[] = new int[nums.length];
        max[0] = nums[0];
        gcd[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max[i] = Math.max(max[i - 1], nums[i]);
            gcd[i] = gcd(max[i], nums[i]);
        }
        Arrays.sort(gcd);
        long sum = 0;
        for (int i = 0; i < (gcd.length / 2); i++) {
            sum += gcd(gcd[i], gcd[nums.length - 1 - i]);
        }
        return sum;
    }
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}