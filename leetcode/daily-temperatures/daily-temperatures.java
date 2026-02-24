class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[nums.length];
        stack.push(0);
        int i=1;
        while(i<nums.length){
            if(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                int ak=stack.pop();
                ans[ak]=i-ak;
            }
            else{
                stack.push(i);
                i++;
            }
        }
        return ans;
    }
}