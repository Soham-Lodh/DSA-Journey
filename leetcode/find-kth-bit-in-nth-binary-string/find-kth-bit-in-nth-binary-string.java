class Solution {
    public char findKthBit(int n, int k) {
        String arr[] = new String[n + 1];
        Arrays.fill(arr, "-1");
        arr[0] = "0";
        arr[1] = "0";
        String str = kk(n, arr);
        return str.charAt(k - 1);
    }
    String kk(int i, String[] arr) {
        if (!arr[i].equals("-1")) return arr[i];
        String prev = kk(i - 1, arr);
        StringBuilder sb = new StringBuilder();
        sb.append(prev);
        sb.append("1");
        for (int j = prev.length() - 1; j >= 0; j--) {
            if (prev.charAt(j) == '1') sb.append("0");
            else sb.append("1");
        }
        arr[i] = sb.toString();
        return arr[i];
    }
}