class Solution {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(n-1,n,"(");
        return res;
    }
    void generate(int o,int c,String g){
        if(o==0 && c==0){
            if(valid(g))res.add(g);
        }
        else if(o==0 && c>0){
            generate(o,c-1,g+')');
        }
        else if(o>0 && c==0){
            return;
        }
        else{
            generate(o-1,c,g+'(');
            generate(o,c-1,g+')');
        }
    }
    boolean valid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')stack.push('(');
            else if(s.charAt(i)==')'){
                if(stack.isEmpty())return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    
}