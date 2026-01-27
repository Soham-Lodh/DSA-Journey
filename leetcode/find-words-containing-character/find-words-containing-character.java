class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int j=0;
            while(j<words[i].length()){
                if(words[i].charAt(j)==x){
                    lst.add(i);
                    break;
                }
                j++;
            }
        }
        return lst;
    }
}