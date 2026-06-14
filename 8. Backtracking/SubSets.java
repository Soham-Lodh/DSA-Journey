
public class SubSets{
        static void subsets(String combo, String s, int i) {
        if (i == combo.length()) {
            System.out.println(s);
            return;
        }
        subsets(combo, s + combo.charAt(i), i + 1);
        subsets(combo, s, i + 1);
        
    }

    public static void main(String[] args) {
        subsets("abc", "", 0);
    }
    }