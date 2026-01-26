class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min=Math.min((arr[i]-arr[i-1]),min);
        }
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                List<Integer> x= new ArrayList<>();
                x.add(arr[i-1]);
                x.add(arr[i]);
                lst.add(x);
            }
        }
        return lst;
    }
}