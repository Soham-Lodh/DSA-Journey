class Solution {
    public int minOperations(String s) {
        int steps0=0;
        int steps1=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0)if(s.charAt(i)!='0')steps0++;
            if(i%2!=0)if(s.charAt(i)!='1')steps0++;
        }
        for(int i=0;i<s.length();i++){
            if(i%2==0)if(s.charAt(i)!='1')steps1++;
            if(i%2!=0)if(s.charAt(i)!='0')steps1++;
        }
        return Math.min(steps0,steps1);
    }
}