import java.util.HashSet;
public class Anagrams {
    static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length())return false;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<str1.length();i++)hs.add(str1.charAt(i));
        for(int i=0;i<str2.length();i++){
            if(!hs.contains(str2.charAt(i)))return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        System.out.println(anagram(str1, str2));
    }
}
