class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> digits=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            StringBuilder sb=new StringBuilder();
            while(n>0){
                sb.append(n%10);
                n/=10;
            }
            for(int j=sb.length()-1;j>=0;j--){
                digits.add((sb.charAt(j)-'0'));
            }
        }
        return digits.stream().mapToInt(Integer::intValue).toArray();
    }
}