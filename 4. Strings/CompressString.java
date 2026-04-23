
public class CompressString {

    static String compress_string(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char current = str.charAt(i);
            int count = 1;
            while (i + count < str.length() && str.charAt(i) == str.charAt(i + count)) {
                count++;
            }
            sb.append(current);
            sb.append(count);
            i += count;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcaaa";
        System.out.println(compress_string(str));
    }
}
