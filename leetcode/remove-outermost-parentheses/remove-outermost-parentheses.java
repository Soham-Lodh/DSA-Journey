class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)=='('){
                if(count>0)sb.append('(');
                count++;
            }
            else{
                count--;
                if(count>0)sb.append(')');
            }
            i++;
        }
        return sb.toString();
    }
}