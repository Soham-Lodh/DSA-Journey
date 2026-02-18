class Solution {
    public boolean hasAlternatingBits(int n) {
        List<Integer> lst=new ArrayList<>();
        while(n>0){
            lst.add(n%2);
            n=n/2;
        }
        for(int i=1;i<lst.size();i++){
            if(lst.get(i)==lst.get(i-1))return false;
        }
        return true;
    }
}