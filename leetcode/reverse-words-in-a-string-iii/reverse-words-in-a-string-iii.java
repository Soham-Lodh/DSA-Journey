class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            int k=words[i].length()-1;
            while(k>=0){
                sb.append(words[i].charAt(k));
                k--;
            }
            if(i!=words.length-1)sb.append(" ");
        }
        String result = sb.toString();
        return result;
    }
}