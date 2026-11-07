class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==1){
            List<List<Integer>> list=new ArrayList<>();
            List<Integer> l=new ArrayList<>();
            l.add(1);
            list.add(l);
            return list;
        }
        else if(numRows==2){
            List<List<Integer>> list=new ArrayList<>();
            List<Integer> l=new ArrayList<>();
            l.add(1);
            list.add(l);
            l=new ArrayList<>();
            l.add(1);
            l.add(1);
            list.add(l);
            return list;
        }
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        l.add(1);
        list.add(l);
        l=new ArrayList<>();
        l.add(1);
        l.add(1);
        list.add(l);
        for(int i=2;i<numRows;i++){
            l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)l.add(1);
                else{
                    int k=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    l.add(k);
                }
            }
            list.add(l);
        }
        return list;
    }
}