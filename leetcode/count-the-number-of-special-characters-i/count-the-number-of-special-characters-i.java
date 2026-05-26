class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        int lower[]=new int[26];
        int upper[]=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                lower[ch-'a']=1;
            }
            else{
                upper[ch-'A']=1;
            }
        }
        for(int i=0;i<26;i++){
            if(lower[i]>0 && upper[i]>0)count++;
        }
        return count;
    }
}