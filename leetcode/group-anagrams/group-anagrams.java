class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> alphagramAnagrams = new HashMap<>();
        for ( String word : strs ) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String alphagram = new String(wordChars);
            alphagramAnagrams.computeIfAbsent(alphagram, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(alphagramAnagrams.values());
        
    }

}