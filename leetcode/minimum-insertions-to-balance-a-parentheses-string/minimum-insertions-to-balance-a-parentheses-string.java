class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    count++;
                }
                if (open > 0) {
                    open--;
                } else {
                    count++;
                }
            }
            i++;
        }
        return count + 2 * open;
    }
}