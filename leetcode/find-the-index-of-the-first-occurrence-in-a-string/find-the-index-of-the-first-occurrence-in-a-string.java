class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int k=needle.length()-1;
                while(k>=0 && i+k<haystack.length()){
                    if(k==0)return i;
                    else if(haystack.charAt(i+k)==needle.charAt(k))k--;
                    else break;
                }
            }
        }
        return index;
    }
}