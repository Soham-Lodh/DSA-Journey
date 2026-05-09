class Solution {
    public List<String> letterCombinations(String digits) {
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> lst=new ArrayList<>();
        Combination(digits,arr,0,lst,"");
        return lst;
    }
    void Combination(String digits,String arr[],int idx,List<String> list,String str){
        if(idx>=digits.length()){
            list.add(str);
            return;
        }
        int n = digits.charAt(idx) - '0';
        for(int i=0;i<arr[n].length();i++){
            Combination(digits,arr,idx+1,list,str+arr[n].charAt(i));
        }
    }
}