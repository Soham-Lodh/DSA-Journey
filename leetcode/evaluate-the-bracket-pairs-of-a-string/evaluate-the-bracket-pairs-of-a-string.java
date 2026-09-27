class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> hs=new HashMap<>();
        Queue<Character> queue=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        for(int i=0;i<knowledge.size();i++){
            hs.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')flag=true;
            else if(s.charAt(i)==')'){
                flag=false;
                StringBuilder temp=new StringBuilder();
                while(!queue.isEmpty())temp.append(queue.poll());
                if(hs.containsKey(temp.toString())){
                    sb.append(hs.get(temp.toString()));
                }
                else sb.append('?');
            }
            else{
                if(flag)queue.offer(s.charAt(i));
                else sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}