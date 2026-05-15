import java.util.*;
public class Number_Combination {
    static void combination(String[] arr,int idx,String str,List<String> sb,String digits){
        if(idx>=digits.length()){
            sb.add(str);
            return;
        }
        int n=digits.charAt(idx)-'0';
        for(int i=0;i<arr[n].length();i++){
            combination(arr,idx+1,str+arr[n].charAt(i),sb,digits);
        }
    }
    public static void main(String[] args) {
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String digits="987";
        List<String> list=new ArrayList<>();
        combination(arr,0,"",list,digits);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}