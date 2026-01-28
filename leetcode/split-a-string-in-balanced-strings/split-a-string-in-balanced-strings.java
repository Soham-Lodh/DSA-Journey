class Solution {
    public int balancedStringSplit(String s) {
        int r=0,l=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')r++;
            else l++;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)=='R')r++;
                else l++;
                if(r==l){
                    count++;
                    r=0;l=0;
                    i=j;
                    break;
                }
            }
        }
        return count;
    }
}