class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            int k=i+1;
            Set<Character>set=new HashSet<>();
            set.add(s.charAt(i));
            while(k<s.length()){
                if(!set.contains(s.charAt(k))){
                    set.add(s.charAt(k));
                    k++;
                }
                else{
                    break;
                }
            }
            maxLen=Math.max(set.size(),maxLen);
        }
        return maxLen;
    }
}