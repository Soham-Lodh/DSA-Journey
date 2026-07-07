class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int k=0;
        for(int i=0;i<intervals.length;i++){
            boolean flag=false;
            for(int j=0;j<intervals.length;j++){
                if(i==j)continue;
                else if(intervals[i][0]>=intervals[j][0] && intervals[i][1]<=intervals[j][1]){
                    flag=true;
                    break;
                }
            }
            if(flag)k++;
        }
        return intervals.length-k;
    }
}