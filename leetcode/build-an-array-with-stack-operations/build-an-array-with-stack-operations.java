class Solution {
    public List<String> buildArray(int[] target, int n) {
        int k=0;
        List<String> lst=new ArrayList<>();
        for(int i=1;i<=Math.min(n,target[target.length-1]);i++){
            if(k<target.length && i==target[k]){
                lst.add("Push");
                k++;
            }
            else{
                lst.add("Push");
                lst.add("Pop");
            }
        }
        return lst;
    }
}