class Solution {
    public int binaryGap(int n) {
        if (Integer.bitCount(n) < 2) return 0;

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            char ch = (char)((n % 2) + '0');
            sb.append(ch);
            n /= 2;
        }
        sb.reverse();
        String s = sb.toString();
        int i = 0;
        while (i < s.length() && s.charAt(i) != '1') i++;
        int max = 0;
        int distance = 0;
        i++;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                max = Math.max(max, distance + 1);
                distance = 0;
            } else {
                distance++;
            }
            i++;
        }

        return max;
    }
}