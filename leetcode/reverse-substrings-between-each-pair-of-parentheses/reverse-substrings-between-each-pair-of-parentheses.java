class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                Queue<Character> sp=new ArrayDeque<>();
                while(!stack.isEmpty() && stack.peek()!='(')sp.offer(stack.pop());
                stack.pop();
                while(!sp.isEmpty())stack.push(sp.poll());
            }
            else stack.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())sb.append(stack.pop());
        return sb.reverse().toString();
    }
}