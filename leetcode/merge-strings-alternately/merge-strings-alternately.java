class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=Math.min(word1.length(),word2.length());
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        while(i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(i<word2.length()){
            sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}