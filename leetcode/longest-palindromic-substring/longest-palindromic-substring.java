class Solution {
    public String longestPalindrome(String s) {
        String ak = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (j - i + 1 <= ak.length()) continue;

                int k = i, l = j;
                boolean ok = true;

                while (k < l) {
                    if (s.charAt(k) != s.charAt(l)) {
                        ok = false;
                        break;
                    }
                    k++;
                    l--;
                }

                if (ok) {
                    ak = s.substring(i, j + 1);
                }
            }
        }
        return ak;
    }
}
