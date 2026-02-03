class Solution {
    public int romanToInt(String s) {
        int sum=0;
        char prev;
        for(int i=0;i<s.length();i++){
            if(i==0)prev=s.charAt(i);
            else prev=s.charAt(i-1);
            if(s.charAt(i)=='I')sum++;
            else if(s.charAt(i)=='V' && prev=='I')sum+=3;
            else if(s.charAt(i)=='V' && prev!='I')sum+=5;
            else if(s.charAt(i)=='X' && prev=='I')sum+=8;
            else if(s.charAt(i)=='X' && prev!='I')sum+=10;
            else if(s.charAt(i)=='L' && prev=='X')sum+=30;
            else if(s.charAt(i)=='L' && prev!='X')sum+=50;
            else if(s.charAt(i)=='C' && prev=='X')sum+=80;
            else if(s.charAt(i)=='C' && prev!='X')sum+=100;
            else if(s.charAt(i)=='D' && prev=='C')sum+=300;
            else if(s.charAt(i)=='D' && prev!='C')sum+=500;
            else if(s.charAt(i)=='M' && prev=='C')sum+=800;
            else if(s.charAt(i)=='M' && prev!='C')sum+=1000;
        }
        return sum;
    }
}