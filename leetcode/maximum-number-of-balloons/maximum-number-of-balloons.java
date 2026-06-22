class Solution {
    public int maxNumberOfBalloons(String text) {
        int str[]=new int[5];
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b')str[0]+=1;
            else if(text.charAt(i)=='a')str[1]+=1;
            else if(text.charAt(i)=='l')str[2]+=1;
            else if(text.charAt(i)=='o')str[3]+=1;
            else if(text.charAt(i)=='n')str[4]+=1;
        }
        str[2]/=2;
        str[3]/=2;
        int max=Integer.MAX_VALUE;
        for(int i:str)max=Math.min(max,i);
        return max;
    }
}