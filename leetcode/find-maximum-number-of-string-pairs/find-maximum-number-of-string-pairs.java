class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> hs=new HashSet<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            String s = new StringBuilder(words[i]).reverse().toString();
            if(hs.contains(s))count++;
            else hs.add(words[i]);
        }
        return count;
    }
}